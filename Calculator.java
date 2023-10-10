import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Simple calculator program which takes two numbers
 * and performs an operation as selected by the user
 *
 * @author: Tanner Dodge
 * @version: 2023.10.02
 */
public class Calculator {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static DecimalFormat df = new DecimalFormat("##.###");
    public static void main(String[] args) throws IOException {
        startSystem();
        menuControl(reader.readLine());
    }

    /**
     * Starts the cycle of using the calculator.
     */
    public static void startSystem() {
        System.out.println("Choose an operation:");
        System.out.println("\t0. Exit calculator.");
        System.out.println("\t1. Addition.");
        System.out.println("\t2. Subtraction.");
        System.out.println("\t3. Multiplication.");
        System.out.println("\t4. Division.");
        System.out.print("Make your menu selection now (0-4): ");
    }

    /**
     * Takes an input and responds by calling the corresponding method.
     * @param input             Number corresponding to operation
     * @throws IOException
     */
    public static void menuControl(String input) throws IOException {
        System.out.println(input);
        if(input.equalsIgnoreCase("0")) {
            System.out.println("You have exited the system. Goodbye!");
        } else if(input.equalsIgnoreCase("1")) {
            method1();
        } else if(input.equalsIgnoreCase("2")) {
            method2();
        } else if(input.equalsIgnoreCase("3")) {
            method3();
        } else if(input.equalsIgnoreCase("4")) {
            method4();
        } else {
            System.out.println("\tERROR: Improper Input (Enter 0-4): ");
        }
        if (!input.equalsIgnoreCase("0")) {
            recall();
        }
    }

    /**
     * Recalls the menuControl method to allow users to use the calculator again.
     * @throws IOException
     */
    public static void recall() throws IOException {
        System.out.print("\nChoose an operation: ");
        String input = reader.readLine();
        menuControl(input);
    }

    /**
     * Performs addition with 2 numbers and displays their sum.
     * Assumes inputs are valid numbers.
     * @throws IOException
     */
    public static void method1() throws IOException {
        System.out.print("Enter first operand (augend): ");
        double num1 = Double.parseDouble(reader.readLine().trim());
        String fnum1 = df.format(num1);
        System.out.println(fnum1);
        System.out.print("Enter second operand (addend): ");
        double num2 = Double.parseDouble(reader.readLine().trim());
        String fnum2 = df.format(num2);
        System.out.println(fnum2);
        double result = num1 + num2;
        String fresult = df.format(result);
        System.out.println(fnum1 + " + " + fnum2 + " = " + fresult);
        System.out.println("The answer (sum) is " + fresult);
    }

    /**
     * Performs subtraction with 2 numbers and displays their difference.
     * Assumes inputs are valid numbers.
     * @throws IOException
     */
    public static void method2() throws IOException {
        System.out.print("Enter first operand (minuend): ");
        double num1 = Double.parseDouble(reader.readLine().trim());
        String fnum1 = df.format(num1);
        System.out.println(fnum1);
        System.out.print("Enter second number (subtrahend): ");
        double num2 = Double.parseDouble(reader.readLine().trim());
        String fnum2 = df.format(num2);
        System.out.println(fnum2);
        double result = num1 - num2;
        String fresult = df.format(result);
        System.out.println(fnum1 + " - " + fnum2 + " = " + fresult);
        System.out.println("The answer (difference) is " + fresult);
    }

    /**
     * Performs multiplication with 2 numbers and displays the product.
     * Assumes inputs are valid numbers.
     * @throws IOException
     */
    public static void method3() throws IOException {
        System.out.print("Enter first operand (multiplicand): ");
        double num1 = Double.parseDouble(reader.readLine().trim());
        String fnum1 = df.format(num1);
        System.out.println(fnum1);
        System.out.print("Enter second operand (multiplier): ");
        double num2 = Double.parseDouble(reader.readLine().trim());
        String fnum2 = df.format(num2);
        System.out.println(fnum2);
        double result = num1 * num2;
        String fresult = df.format(result);
        System.out.println(fnum1 + " * " + fnum2 + " = " + fresult);
        System.out.println("The answer (product) is " + fresult);
    }

    /**
     * Performs division with 2 numbers and displays the quotient.
     * Assumes inputs are valid numbers.
     * @throws IOException
     */
    public static void method4() throws IOException {
        System.out.print("Enter first operand (dividend): ");
        double num1 = Double.parseDouble(reader.readLine().trim());
        String fnum1 = df.format(num1);
        System.out.println(fnum1);
        System.out.print("Enter second operand (divisor): ");
        double num2 = Double.parseDouble(reader.readLine().trim());
        String fnum2 = df.format(num2);
        System.out.println(fnum2);
        double result = (num1 / num2);
        String fresult = df.format(result);
        System.out.println(fnum1 + " / " + fnum2 + " = " + fresult);
        System.out.println("The answer (quotient) is " + fresult);
    }
}
