import java.util.*;
import java.io.*;
/**
 * This program reads a file that contains several students' names and marks and outputs average scores.
 * 
 * @author Kara I
 * @version 08/11/2017
 */
public class StudentAverages
{
    public static void main (String[] args) throws IOException
    {
        // read and save the file
        String[] lines = new String[1000];
        Scanner sc = new Scanner(new File("../data/StudentScores.in"));
        int maxI = -1;
        while (sc.hasNext())
        {
            lines[++maxI] = sc.nextLine();
        }
        sc.close();
        
        // for each line, parse the string
        // then output name and average mark
        for (int i = 0; i <= maxI; i++)
        {
            Scanner lsc = new Scanner(lines[i]);
            // get name
            String name = lsc.next();
            // get all the marks and divide by the count to find average
            int sum = 0, count = 0;
            while (lsc.hasNextInt())
            {
                sum += lsc.nextInt();
                count++;
            }
            int average = sum / count;
            // output the results
            System.out.println(name + ", average = " + average);
        }
    }

}
