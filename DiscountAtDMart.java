import java.util.Scanner ;

public class DiscountAtDMart
{
    public static void main (String [] args )
    {
        System.out.print ('\u000c');
        
        int cost = 0;
        int discount1 = 0;
        int discount2 = 0;
        
        Scanner scan = new Scanner (System.in) ;
        
        System.out.println ("Please enter the final price of artilce purchased .");
        cost = scan.nextInt ();
        System.out.println ("Please enter the two successive discounts offered .");
        discount1 = scan.nextInt ();
        discount1 = scan.nextInt ();
        
        double discount = ((cost * discount1 * discount2) / 10000);
        double originalCost = (cost + discount );
        
        System.out.println ("The article was originally priced at " + originalCost + " rupees .");
        System.out.println ("The discount offered was " + discount + " rupees .");
    }
}
