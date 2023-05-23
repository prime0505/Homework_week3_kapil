/* Write a Java program to sum values of an array.
 */
package Homework_week3;
import java.util.Scanner;
public class Programme18
{
    public static void main(String[] args)
    {
        int a[]=new int[5];
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the elements: ");
        for (int i=0;i<a.length;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("Array elements:");
        for(int i=0; i<a.length;i++)
        {
            System.out.println(a[i]+" ");
            sum=a[i]+sum;
        }
        System.out.println("/n ADDITION OF ARRAY ELEMENTS: "+sum);
    }
}


