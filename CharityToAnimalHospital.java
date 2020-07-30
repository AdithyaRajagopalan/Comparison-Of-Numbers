import java.util.Scanner ;

public class CharityToAnimalHospital
{
    public static void main (String [] args )
    {
        System.out.print('\u000c');
        
        int packetsReceived , dozens , extra , gross;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter the no. of packets recieved as charity to the hospital .");
        packetsReceived = scan.nextInt();
        
        gross = (packetsReceived / 144);
        int remaining1 = (packetsReceived % 144);
        dozens = (remaining1 / 12);
        extra = (remaining1 & 12);
        
        System.out.println ("The no. of packets received are "+gross+" gross , "+dozens+" dozens and "+extra+" extra packets !!!");
    }
}