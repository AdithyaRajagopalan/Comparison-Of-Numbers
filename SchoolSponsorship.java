import java.util.Scanner ;
import java.lang.Math ;

public class SchoolSponsorship
{
    public static void main (String [] args )
    {
        System.out.print ('\u000c');
        
        int initialAmount = 50000 , g1 = 5200 , g2 = 6800 , gpaid = (g1 + g2);
        double amountByEachRemGroup = ((initialAmount - gpaid)/5);
        
        System.out.println("Each remaining group has to pay Rs." + amountByEachRemGroup);
    }
}