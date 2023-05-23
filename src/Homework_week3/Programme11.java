/* . Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.*/
package Homework_week3;

public class Programme11
{
    public static void main(String[] args)
    {
        int a = 3;
        int b = 5;
        System.out.println("This numbers are divided by :"+a);
        numberDivided3(3);
        System.out.println("This numbers are divided by :"+b);
        numberDivided5(5);
    }

    public static void numberDivided3(int number)
    {
        if (number <= 100)
        {
            System.out.println(number);
            numberDivided3(number + 3);
        }
    }
    public static void numberDivided5(int number)
    {
        if (number <= 100)
        {
            System.out.println(number);
            numberDivided5(number + 5);

        }
    }
}


