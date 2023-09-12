import java.util.Scanner;

public class Basiccalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Basic Calculator!");
        System.out.println("Please enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Please enter the operator (+, -, *, /):");
        String operator = scanner.next();

        System.out.println("Please enter the second number:");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}

