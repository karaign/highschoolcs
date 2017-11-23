import java.util.*;
/**
 * The main class
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    /**
     * The main method
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the A value for the line: ");
        DistToLine.A = sc.nextDouble();
        System.out.print("Enter the B value for the line: ");
        DistToLine.B = sc.nextDouble();
        System.out.print("Enter the C value for the line: ");
        DistToLine.C = sc.nextDouble();
        
        double x, y;
        System.out.print("Enter the x coordinate of the point: ");
        x = sc.nextDouble();
        System.out.print("Enter the y coordinate of the point: ");
        y = sc.nextDouble();
        
        System.out.print("\n");
        
        System.out.println("Distance from the point to the line is: " + DistToLine.getDist(x, y));
        
    }

}
