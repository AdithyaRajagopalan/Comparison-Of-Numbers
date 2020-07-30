import java.util.Scanner ;

public class CalculateTheProfit
{
    public static void main (String [] args )
    {
        System.out.print ('\u000c');
        
        double costPrice , sellingPrice ;
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("Enter the cost price and selling price of the article .");
        
        costPrice = scan.nextDouble();
        sellingPrice = scan.nextDouble();
        
        double profit = (sellingPrice - costPrice);
        
        System.out.println ("Profit obtained on the article is Rs." + profit );
    }
}