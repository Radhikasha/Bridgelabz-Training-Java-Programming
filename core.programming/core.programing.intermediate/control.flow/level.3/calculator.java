import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.println("Enter operator (+, -, *, /): ");
        String op = sc.next();
        double result;
        switch (op) {
            case "+":
                result = a + b;
                System.out.println(result);
                break;
            case "-":
                result = a - b;
                System.out.println(result);
                break;
            case "*":
                result = a * b;
                System.out.println(result);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                    break;
                }
                result = (double) a / b;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

}
