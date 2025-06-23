import java.util.Scanner;

public class Calculator {

 // Methods for basic operations

 public static double add(double a, double b) {

 return a + b;

 }

 public static double subtract(double a, double b) {

 return a - b;

 }

 public static double multiply(double a, double b) {

 return a * b;

 }

 public static double divide(double a, double b) {

 if (b == 0) {

 System.out.println("Error: Division by zero is not allowed.");

 return Double.NaN;

 }

 return a / b;

 }

 public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);

 boolean continueCalc = true;

 System.out.println("===== Java Console Calculator =====");

 while (continueCalc) {

 // Menu display

 System.out.println("\nChoose an operation:");

 System.out.println("1. Addition (+)");

 System.out.println("2. Subtraction (-)");

 System.out.println("3. Multiplication (*)");

 System.out.println("4. Division (/)");

 System.out.println("5. Exit");

 System.out.print("Enter your choice (1-5): ");

 int choice = scanner.nextInt();

 if (choice == 5) {

 continueCalc = false;

 System.out.println("Exiting Calculator. Goodbye!"); double num2 = scanner.nextDouble();

 double result = 0;

 // Performing operation

 switch (choice) {

 case 1:

 result = add(num1, num2);

 System.out.println("Result: " + result);

 break;

 case 2:

 result = subtract(num1, num2);

 System.out.println("Result: " + result);

 break;

 case 3:

 result = multiply(num1, num2);

 System.out.println("Result: " + result);

 break;

 case 4:

 result = divide(num1, num2);

 if (!Double.isNaN(result))

 System.out.println("Result: " + result);

 break;

 default:

 System.out.println("Invalid choice. Please try again.");

 }

 }

 scanner.close();

 }

}
