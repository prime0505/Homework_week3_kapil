/*Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)*/
package Homework_week3;
import java.util.Scanner;

public class Programme1
{
    public static void main(String[] args)
    {   //create a simple object for scanner
        Scanner sc = new Scanner(System.in);
        // simple print statement
        System.out.println("Please enter number: ");
        // to get the input from the user at run time
        int number = sc.nextInt();
        sc.close();
        // using normal ternary operator
        String result = number % 2 == 0 ? "Even" : "Odd";
        System.out.println(number + " is " + result);
    }
}
