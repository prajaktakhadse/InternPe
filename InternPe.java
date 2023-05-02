import java.util.*;

public class InternPe {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char operator;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:--");

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            default:
                System.out.println("Error ! please provide valid input..!!");
                return;
        }
        System.out.println("Result:- " + " " + num1 + " " + operator + " " + num2 + "=" + ans);
    }
}