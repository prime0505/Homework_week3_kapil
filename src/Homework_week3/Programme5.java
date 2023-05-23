/* WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary*/
package Homework_week3;
import java.util.Scanner;
public class Programme5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the employee ID: ");
        int emp = sc.nextInt();
        System.out.println("Please enter the employee name: ");
        String name = sc.next();
        System.out.println("Please enter the employee basic salary: ");
        int salary = sc.nextInt();
        int HRA =(salary *10)/100;
        System.out.println(HRA);
        int DA =(salary *8)/100;
        System.out.println(DA);
        int TA =(salary *9)/100;
        System.out.println(TA);
        int PF= (salary*20)/100;
        System.out.println(PF);
        int gross_salary = (salary + HRA + TA + DA-PF);
        System.out.println(gross_salary);

        System.out.println("_____________________________________");
        System.out.println("|                                   |");
        System.out.println("|           Salary slip             |");
        System.out.println("|___________________________________|");
        System.out.println("| Employee id:              "+emp+"     |");
        System.out.println("| employee Name:            "+name+"   |");
        System.out.println("|___________________________________|");
        System.out.println("| Basic Salary:            "+salary+"    |");
        System.out.println("| HRA 10%:                 "+HRA+"     |");
        System.out.println("| TA 8%  :                 "+TA+"     |");
        System.out.println("| DA 9%  :                 "+DA+"     |");
        System.out.println("| PF-20& :                 "+PF+"     |");
        System.out.println("|___________________________________|");
        System.out.println("| Gross salary :           "+gross_salary+"    |");
        System.out.println("|___________________________________|");
        System.out.println("|___________________________________|");





    }
}






