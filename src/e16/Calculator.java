package e16;

public class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    
    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Calling the add method with different parameter lists
        System.out.println("Sum of 5 and 7: " + calc.add(5, 7));
        System.out.println("Sum of 5, 7, and 10: " + calc.add(5, 7, 10));
        System.out.println("Sum of 3.5 and 2.5: " + calc.add(3.5, 2.5));
        System.out.println("Concatenation of 'Hello' and 'World': " + calc.add("Hello", "World"));
    }
}

