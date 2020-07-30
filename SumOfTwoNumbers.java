import java.util.Scanner ;

public class SumOfTwoNumbers
{
    public static void main (String [] args)
    {
        System.out.print('\u000c');
        
        double a = 0 , b = 0 ;
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the two numbers whose sum is to be calculated '");
        
        a = scan.nextDouble();
        b = scan.nextDouble();
        
        System.out.println ("The sum of the two numbers is : " + (a + b));
    }
}