import java.util.Scanner ;

public class GreatestOfThreeNumbers
{
    public static void main (String [] args)
    {
        System.out.print('\u000C');
        
        double a = 0;
        double b = 0;
        double c = 0;
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the three numbers to be compared .");
        
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        
        System.out.print("The greatest number is :");        
        
        if (a > b)
        {
            if (a > c)
            {
                System.out.print(a);
            }
            else
            {
                System.out.println(c);
            }
        }
        
        else if (b > a)
        {
            if (b > c)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }
        
        else
        {
            System.out.println("none . All the numbers are equal .");
        }
    }
}