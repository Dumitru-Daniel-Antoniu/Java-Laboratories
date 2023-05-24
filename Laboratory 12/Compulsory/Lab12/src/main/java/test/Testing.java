package test;

import org.junit.jupiter.api.Test;

public class Testing {
    private static int number;
    private static String name;
    private static int age;

    public Testing() {
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Testing.number = number;
    }

    @Test
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Testing.name = name;
    }
    @Test
    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Testing.age = age;
    }
}

