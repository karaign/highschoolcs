/**
 * This program reads the file Switches.in, where each number is the decimal form of a byte
 * where each bit represents whether a switch is on or off, then prints the status of each switch.
 */

import java.io.*; //necessary for File and IOException
import java.util.*; // Scanner

/**
 * The main class
 */
public class Main
{
    public static void main(String args[]) throws IOException
    {
        final int SWITCHES_START_AT = 56;
        
        Scanner sf = new Scanner(new File("../data/Switches.in"));
        int maxIndx = -1; //-1 so when we increment below, the first index is 0
        String text[] = new String[1000]; //To be safe, declare more than we need
        while (sf.hasNext())
        {
            maxIndx++;
            text[maxIndx] = sf.nextLine();
        }
        // maxIndx is now the highest index of text[].Equals - 1 if no text lines
        sf.close(); //We opened a file above, so close it when finished.
        
        int twoToThe[] = new int[8]; // keep powers of two to use them as masks
        // from 2^0 to 2^7
        for (int i = 0; i < twoToThe.length; i++)
        {
            twoToThe[i] = (int) Math.pow(2, i);
        }
        
        for (int j = 0; j <= maxIndx; j++)
        {
            // parse the data value
            int data = Integer.parseInt(text[j]);
            System.out.println("Switch status for data value " + data + ":");
            // for every bit, check whether it's 1 or 0
            for (int mask : twoToThe)
            {
                int bit = data & mask;
                boolean isOn = (bit == mask);
                System.out.println("\tSwitch sf" + SWITCHES_START_AT + " is \"" + (isOn ? "on" : "off") + "\"");
            }
        }
    }
}
