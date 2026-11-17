class Calculator {

    // Method 1: Addition of two integers
    int calculate(int a, int b) {
        return a + b;
    }

    // Method 2: Multiplication of two double values
    double calculate(double a, double b) {
        return a * b;
    }

    // Method 3: Largest of three integers
    int calculate(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > c)
            return b;
        else
            return c;
    }

    // Method 4: Difference of integer and double
    double calculate(int a, double b) {
        return a - b;
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println("Sum = " + obj.calculate(10, 20));

        System.out.println("Product = " + obj.calculate(2.5, 4.0));

        System.out.println("Largest = " + obj.calculate(10, 25, 15));

        System.out.println("Difference = " + obj.calculate(20, 5.5));
    }
}

