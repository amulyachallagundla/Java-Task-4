package Calculator;

public class Calculate {
    // Addition (int)
    public static int add(int a, int b) {
        return a + b;
    }

    // Addition (double) - Method Overloading
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Division with exception handling
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    // Utility method to show pass-by-value
    public static void changeValue(int x) {
        x = 100;
        System.out.println("Inside method value: " + x);
    }

    public static void main(String[] args) {

        System.out.println("Addition (int): " + add(10, 20));
        System.out.println("Addition (double): " + add(10.5, 20.5));
        System.out.println("Subtraction: " + subtract(20, 10));
        System.out.println("Multiplication: " + multiply(5, 4));

        try {
            System.out.println("Division: " + divide(10, 2));
            System.out.println("Division: " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        int value = 50;
        System.out.println("Before method call value: " + value);
        changeValue(value);
        System.out.println("After method call value: " + value);
    }
}


