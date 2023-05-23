/*0.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else) */
package Homework_week3;
import java.util.Scanner;
public class Programme10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number  : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("select and enter the tye of operation");
        char op = sc.next().charAt(0);
        calculations(a, b, op); //Calling static method
        sc.close();
    }
    public static int calculations(int a, int b, char op) {
        int ans = 0;
        // addition
        if (op == '+') {
            ans = a + b;
            // subtraction
        } else if (op == '-') {
            ans = a - b;
            // multiplication
        } else if (op == '*') {
            ans = a * b;
            // modulo
        } else if (op == '/') {
            ans = a / b;
        }

        // printing the final result
        System.out.println("Your answer is : " + ans);
        return ans;

    }

}



