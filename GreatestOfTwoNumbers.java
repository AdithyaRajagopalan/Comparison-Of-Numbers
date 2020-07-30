import java.util.Scanner ;

public class GreatestOfTwoNumbers
{
    public static void main (String [] args)
    {
        System.out.print('\u000C');
        
        double num1 = 0;
        double num2 = 0;
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter two numbers which you want to compare .");
        
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        
        if (num1 > num2)
        {
            System.out.println(num1 + " is the greater number .");
        }
        else if (num1 < num2)
        {
            System.out.println(num2 + " is the greater number .");
        }
        else
        {
            System.out.println("Both the numbers entered are equal .");
        }
    }
}