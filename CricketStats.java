import java.util.Scanner ;
import java.lang.Math ;

public class CricketStats
{
    public static void main (String [] args )
    {
        System.out.print ('\u000c');
        
        int runs , matches , wickets;
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("Enter the runs scored , matches played and wickets taken .");
        
        runs = scan.nextInt();
        matches = scan.nextInt();
        wickets = scan.nextInt();
        
        double bowlingAvg = (runs/wickets);
        
        System.out.println("Bowling average of the player is " + bowlingAvg);
    }
}