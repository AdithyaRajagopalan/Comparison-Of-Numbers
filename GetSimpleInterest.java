import java.util.Scanner ;

public class GetSimpleInterest
{
    public static void main (String [] args )
    {
        System.out.print ('\u000c');
        
        int amount , rate ;
        double simpleInterest , time ;
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("Enter the following information .");
        
        System.out.println ("Amount borrowed .");
        amount = scan.nextInt();
        
        System.out.println ("Rate of interest charged on the amount .");
        rate = scan.nextInt();
        
        System.out.println ("Time period for which amount was borrowed .");
        time = scan.nextDouble();
        
        simpleInterest = ((amount * time * rate) / 100);
        
        System.out.println ("The simple interest to be paid is Rs." + simpleInterest );
    }
}