import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0.0;

        while (true) {
            System.out.print("Enter Operator (+, -, *, /) or 'end' to stop: ");
            String operator = sc.next();

            if (operator.equals("end")) {
                break;
            }

            System.out.print("Enter two numbers: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();

            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
                default -> {
                    System.out.println("Invalid operator!");
                    continue;
                }
            }

            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
