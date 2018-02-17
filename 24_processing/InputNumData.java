import java.io.*;
import java.util.*;
/**
 * The main class 
 * 
 * @author  Kara I
 * @version 06/11/2017
 */
public class InputNumData
{
    /**
     * The main function
     */
    public static void main (String[] args) throws IOException
    {
       Scanner sf = new Scanner(new File("../data/NumData.in"));
       int maxIndx = -1;
       
       String[] text = new String[1000];
       // save the file to an array line by line
       while (sf.hasNext())
       {
           text[++maxIndx] = sf.nextLine();
       }
       sf.close();
       
       // for each line, print the sum of the numbers
       for (int line = 0; line <= maxIndx; line++)
       {
           Scanner sc = new Scanner(text[line]);
           int sum = 0;
           String output = "";
           while (sc.hasNextInt())
           {
               int number = sc.nextInt();
               output += " + " + number;
               sum += number;
           }
           
           output = output.substring(3); // remove leading whitespace and + sign
           
           System.out.println(output + " = " + sum);
       }
    }

}
