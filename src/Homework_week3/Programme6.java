/*Write a java program to input any number and find out if it’s odd or even */
package Homework_week3;
import java.util.Scanner;

public class Programme6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num= sc.nextInt();
        if (num%2==0)
        {
            System.out.println("this number is Even: "+num);
        }
        else
        {
            System.out.println("this number is odd: "+num);
        }

    }
}
