/* Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”
*/
package Homework_week3;
import java.util.Scanner;
public class Programme16
{
    public static void main( String args[] )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num= sc.nextInt();
        Programme16 p1 =new Programme16();
        p1.checkNumber(num);
    }
    public int checkNumber(int number)
    {
        //check if number is positive, negative or zero
        if (number > 0)
        {
            System.out.println(number + " is POSITIVE NUMBER.");
        }
        else if (number < 0)
        {
            System.out.println(number + " is NEGATIVE NUMBER.");
        } else
        {
            System.out.println(number + " is a ZERO.");
        }
        return number;
    }

}
