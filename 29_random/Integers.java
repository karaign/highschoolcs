import java.util.*;
/**
 * Generates 33 random integers from 71 to 99
 */
public class Integers
{
    public static void main(String args[])
    {
        Random r = new Random();
        // constants
        final int FROM = 71;
        final int TO = 99;
        final int NUMBERS = 33;
        
        // find the difference between TO ad FROM
        int diff = TO - FROM;
        
        //in a loop, output a random int of the form FROM + random([0, diff]) NUMBERS times
        for (int i = 0; i < NUMBERS; i++)
        {
            System.out.println(FROM + r.nextInt(diff + 1));
        }
    }

}
