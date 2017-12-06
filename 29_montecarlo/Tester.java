
/**
 * The main class of a program that tests the MonteCarlo class
 *
 * @author Kara I
 * @version 29/11/2017
 */
public class Tester
{
    public static void main (String args[])
    {
        MonteCarlo mcObj = new MonteCarlo(5, 3, 2);
        int sqrCount = 0, cirCount = 0;
        
        for (int i = 0; i < 10000000; i++)
        {
            double x = mcObj.nextRainDrop_x();
            double y = mcObj.nextRainDrop_y();
            if (mcObj.insideCircle(x, y))
            {
                cirCount++;
            }
            sqrCount++;
        }
        
        double side = 2 * mcObj.r;
        double pi = cirCount * Math.pow(side, 2) / (sqrCount * Math.pow(mcObj.r, 2));
        
        System.out.println("pi ≈ " + pi);
        System.out.println("Math.PI = " + Math.PI);
    }
}
