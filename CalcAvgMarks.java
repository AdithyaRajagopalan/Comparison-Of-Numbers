import java.util.* ;
import java.lang.* ;

public class CalcAvgMarks
{
    public static void main (String [] args)
    {
        System.out.print('\u000c');
        
        double term1 , term2 , term3 , average1 ;
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter your marks for the following :");
        
        System.out.println ("Term 1");
        term1 = scan.nextDouble();
        
        System.out.println ("Term 2");
        term2 = scan.nextDouble();
        
        System.out.println ("Term 3");
        term3 = scan.nextDouble();
        
        average1 = ((term1 + term2 + term3)/3);
        int average2 = (int)(average1*100);
        double average3 = (((double)(average2))/100);
        
        System.out.println ("The average marks obtained by you for the whole year is " + average3 + " marks !");
    }
}
