import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter the Choice: ");
        int ch = scanner.nextInt();
        
        System.out.print("Enter First Number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter Second Number: ");
        double b = scanner.nextDouble();

        

        double res = 0;
        switch (ch) {
            case 1:
                res = a + b;
                break;
            case 2:
                res = a - b;
                break;
            case 3:
                res = a * b;
                break;
            case 4:
                res = a / b;
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }
        System.out.println("Result: " + res);
    }
}
