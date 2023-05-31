import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;
import org.junit.jupiter.api.Test;

public class Lab12 {
    public static void classInformations(String className) {
        try {
            Class testedClass = Class.forName(className);
            Package testedPackage = testedClass.getPackage();
            System.out.println("Class name: " + testedClass.getName());
            System.out.println("Package name: " + testedPackage.getName());
            Method[] classMethods = testedClass.getDeclaredMethods();
            for(Method method : classMethods) {
                if(method.getAnnotation(Test.class) != null) {
                    if(method.getParameterCount() == 0) {
                        method.setAccessible(true);
                        method.invoke(null);
                        System.out.println("Test method invoked: " + method.getName());
                    }
                }
            }
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
    }

    public static void main(String[] args) {
        String className = "test.Testing";
        classInformations(className);
    }
}
