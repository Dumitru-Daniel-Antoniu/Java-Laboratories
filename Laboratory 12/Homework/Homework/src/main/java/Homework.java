import org.junit.jupiter.api.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;

public class Homework {
    public static void classInformation(String[] list, int i, int length) {
        if(i < length) {
            String[] parts = list[i].split("\\.");
            if(!parts[0].equals("Homework")) {
                try {
                    Class testedClass = Class.forName(parts[0]);
                    Package testedPackage = testedClass.getPackage();
                    System.out.println("Class name: " + testedClass.getName());
                    System.out.println("Package name: " + testedPackage.getName());
                    Field[] classFields = testedClass.getFields();
                    for(Field field : classFields) {
                        System.out.println("Field name: " + field.getName());
                        System.out.println("Field type: " + field.getType());
                    }
                    int numberOfMethods = 0;
                    int numberOfTestedMethods = 0;
                    Method[] classMethods = testedClass.getDeclaredMethods();
                    for(Method method : classMethods) {
                        System.out.println("Method name: " + method.getName());
                        numberOfMethods += 1;
                        if(method.getParameterCount() > 0) System.out.println("Method parameters: " + method.getParameters());
                        else System.out.println("The method has no parameters");
                        if(method.getAnnotation(Test.class) != null) {
                            numberOfTestedMethods += 1;
                            if(Modifier.isStatic(method.getModifiers())) {
                                if(method.getParameterCount() == 0) {
                                    method.setAccessible(true);
                                    method.invoke(null);
                                    System.out.println("Test method invoked: " + method.getName());
                                }
                            }
                            else {
                                if(method.getParameterCount() == 0) {
                                    method.setAccessible(true);
                                    Object object = testedClass.newInstance();
                                    method.invoke(object);
                                    System.out.println("Test method invoked: " + method.getName());
                                }
                            }
                        }
                    }
                    System.out.println("Statistics of testing: " + (double) numberOfTestedMethods/numberOfMethods);
                }
                catch(ClassNotFoundException ex) {
                    System.err.println(ex);
                }
                catch(IllegalAccessException ex) {
                    System.err.println(ex);
                }
                catch(InvocationTargetException ex) {
                    System.err.println(ex);
                }
                catch(InstantiationException ex) {
                    System.err.println(ex);
                }
            }
            classInformation(list, i + 1, length);
        }
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\wwwdd\\OneDrive\\Desktop\\Faculty\\Year 2\\Second semester\\Advanced Programming\\Laboratory 12\\Homework\\TestedClasses\\target\\classes";
        String path1 = "C:\\Users\\wwwdd\\OneDrive\\Desktop\\Testing";
        File dir = new File(path);
        String[] list = dir.list();
        int length = list.length;
        classInformation(list, 0, length);
    }
}
