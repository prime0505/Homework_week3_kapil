/*  Write a Java program to calculate the average value of array elements.*/
package Homework_week3;
public class Programme19
{
    public static void main(String[] args)
    {
        arrayToStringArray();//Calling static method
    }
        public static void arrayToStringArray() {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        //calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
