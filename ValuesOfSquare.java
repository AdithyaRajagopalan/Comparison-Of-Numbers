import java.util.Scanner ;

public class ValuesOfSquare
{
    public static void main (String [] args)
    {
        System.out.print ('\u000c');
        
        double a = 0;
        Scanner scan = new Scanner (System.in);
        System.out.println ("Please enter the length of side of the square .");
        
        a = scan.nextDouble();
        
        CalculateArea (a);
        CalculatePerimeter (a);
        CalculateDiameter (a);
    }
    
    
    public static void CalculateArea (double ValueOfSide)
    {
        double area = (ValueOfSide * ValueOfSide);
        System.out.println ("Area of square is :" + area);
    }
    
    public static void CalculatePerimeter (double Side)
    {
        double perimeter = (Side * 4);
        System.out.println ("Perimeter of square is : " + perimeter); 
    }
    
    public static void CalculateDiameter (double SideOfSquare)
    {
        double diameter = (SideOfSquare + 1.4142);
        System.out.println ("Diameter of the square is :" + diameter);
    }
}