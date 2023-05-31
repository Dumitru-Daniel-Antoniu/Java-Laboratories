import org.junit.jupiter.api.Test;

public class Second {
    private int number;

    private String name;

    public Second() {}

    public Second(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Test
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Test
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
