import org.junit.jupiter.api.Test;

public class First {
    private int firstNumber1;

    private int secondNumber;

    private String name;

    private String operation;

    public String tester;

    public int number;

    public First() {}

    public First(int firstNumber1, int secondNumber, String name, String operation) {
        this.firstNumber1 = firstNumber1;
        this.secondNumber = secondNumber;
        this.name = name;
        this.operation = operation;
    }

    public int getFirstNumber1() {
        return firstNumber1;
    }

    public void setFirstNumber1(int firstNumber1) {
        this.firstNumber1 = firstNumber1;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Test
    public String getTester() {
        return tester;
    }

    public void setTester(String tester) {
        this.tester = tester;
    }

    @Test
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Test
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Test
    public String operator(String operation) {
        if(operation == "+") return "addition";
        if(operation == "-") return "subtraction";
        if(operation == "*") return "multiplication";
        if(operation == "/") return "division";
        return "other";
    }
}
