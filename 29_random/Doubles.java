import java.util.*;
/**
 * Generates 27 random doubles from 99.78 to 147.22
 */
public class Doubles
{
    public static void main(String args[])
    {
        Random r = new Random();
        // constants
        final double FROM = 99.78;
        final double TO = 147.22;
        final int NUMBERS = 27;
        
        // find the difference between TO ad FROM
        double diff = TO - FROM;
        
        //in a loop, output a random int of the form FROM + diff*random([0,1]) NUMBERS times
        for (int i = 0; i < NUMBERS; i++)
        {
            System.out.println(FROM + diff * r.nextDouble());
        }
    }

}
