import java.util.Scanner ;
import java.lang.Math ;

public class CostOfCocaCola
{
    public static void main (String [] args )
    {
        System.out.print('\u000c');
        
        int can_r15 = 50 , can_r20 = 30 , can_r21 = 40;
        int cost15 = (15*can_r15) , cost20 = (20*can_r20) , cost21 = (21*can_r21);
        int totalCost = (cost15 + cost20 + cost21);
        
        System.out.println("The total cost of all the CocaCola cans is Rs." + totalCost);
    }
}