import java.util.Scanner ;

public class StudentDetailsForm
{
    public static void main (String [] args)
    {
       System.out.print ('\u000C');
        
       String name , subject , school , city ;
       int class1 = 0;
       
       Scanner scan = new Scanner (System.in);
       
       System.out.println ("Please enter your name .");
       name = scan.nextLine();
       
       System.out.println ("Please enter your subject .");
       subject = scan.nextLine();
       
       System.out.println ("Please enter your school's name .");
       school = scan.nextLine();
       
       System.out.println ("Please enter your city .");
       city = scan.nextLine();
       
       System.out.println ("Please enter your class .");
       class1 = scan.nextInt();
       
       System.out.println ("Hello " + name + " ! ");
       System.out.println ("You are studying " + subject + " subject in grade " + class1);
       System.out.println ("In " + school );
       System.out.println (" and you are currently living in the city of " + city);
       
    }
}
