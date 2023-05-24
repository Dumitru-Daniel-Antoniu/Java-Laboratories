import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;
import org.junit.jupiter.api.Test;

public class Lab12 {
    public static void main(String[] args) {
        if(args.length < 1) {
            System.err.println("Input: <class name>");
        }
        try {
            Class testedClass = Class.forName(args[0].toString());
            Package testedPackage = testedClass.getPackage();
            System.out.println("Name of the class: " + testedClass.getName());
            System.out.println("Name of the package: " + testedPackage.getName());
            Method[] classMethods = testedClass.getDeclaredMethods();
            for(Method method : classMethods) {
                Annotation annotation = method.getAnnotation(Test.class);
                if(annotation != null && method.getParameterCount() == 0) {
                    method.setAccessible(true);
                    method.invoke(null);
                    System.out.println("Name of the methos is: " + method.getName());
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
}
