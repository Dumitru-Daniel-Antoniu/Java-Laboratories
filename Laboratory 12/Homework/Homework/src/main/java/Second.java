import org.junit.jupiter.api.Test;

public class Second {
    private static int number;

    private static String name;

    public Second() {}

    public Second(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Test
    public static int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Test
    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
