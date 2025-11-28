import java.util.Scanner;

public class Problem1 {

    public static void add(double a, double b) {
        try {
            double sum = a + b;
            System.out.println("Sum of " + a + " and " + b + " = " + sum);
        } catch (Exception e) {
            System.out.println("Can't define the value");
        }
    }

    public static void sub(double a, double b) {
        try {
            double sub = a - b;
            System.out.println("Subtraction of " + a + " and " + b + " = " + sub);
        } catch (Exception e) {
            System.out.println("Can't define the value");
        }
    }

    public static void mul(double a, double b) {
        try {
            double mul = a * b;
            System.out.println("Multiplication of " + a + " and " + b + " = " + mul);
        } catch (Exception e) {
            System.out.println("Can't define the value");
        }
    }

    public static void div(double a, double b) {
        try {
            if (b == 0) {
                System.out.println("Cannot divide by zero!");
            } else {
                double div = a / b;
                System.out.println("Division of " + a + " and " + b + " = " + div);
            }
        } catch (Exception e) {
            System.out.println("Can't define the value");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = 'Y';

        while (ch == 'Y' || ch == 'y') {
            System.out.println("\nEnter your Option:");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("Any other key - Exit");
            System.out.print("Your choice: ");

            int choice = sc.nextInt();

            System.out.print("Enter number 1: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter number 2: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    add(num1, num2);
                    break;
                case 2:
                    sub(num1, num2);
                    break;
                case 3:
                    mul(num1, num2);
                    break;
                case 4:
                    div(num1, num2);
                    break;
                default:
                    System.out.println("Exiting...");
                    return;
            }

            System.out.print("\nDo you want to continue? (Y/N): ");
            ch = sc.next().charAt(0);
        }

        System.out.println("Program ended.");
        sc.close();
    }
}
