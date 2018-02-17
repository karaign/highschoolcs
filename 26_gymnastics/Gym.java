import java.io.*; //necessary for File and IOException
import java.util.*; //necessary for Scanner

/**
 * A program that reads competitor scores from a text file and prints out the averages,
 * discarding the highest score and the lowest score beforehand.
 */
public class Gym
{
    public static void main(String args[]) throws IOException
    {        
        Scanner sf = new Scanner(new File("../data/DataGym.in"));
        int maxIndx = -1; //-1 so when we increment below, the first index is 0
        String text[] = new String[1000]; //To be safe, declare more than we need
        while (sf.hasNext())
        {
            maxIndx++;
            text[maxIndx] = sf.nextLine();
        }
        // maxIndx is now the highest index of text[].Equals - 1 if no text lines
        sf.close(); //We opened a file above, so close it when finished.
        //System.exit(0); //Use this for testing… to temporarily end the program here
        
        for (int j = 0; j <= maxIndx; j++)
        {   
            String txtScores[] = text[j].split(" ");
            double scores[] = new double[10];
            // store all the scores for each competitor in a numeric array
            for (int i = 0; i < scores.length; i++)
            {
                scores[i] = Double.parseDouble(txtScores[i]);
            }
            // sort the array
            Arrays.sort(scores);
            // add up all the scores except the first one and the last one
            // then divide them by the number of scores to find the average
            double sum = 0;
            for (int i = 1; i < scores.length - 1; i++)
            {
                sum += scores[i];
            }
            double average = sum / (scores.length - 2);
            
            // finally, print out the formatted average
            System.out.printf("For Competitor #%d, the average is %.4f\n", j + 1, average);
        }
    }
}