import java.util.*;
/**
 * The main class of the program that censors outgoing messsages
 * 
 * @author Kara I
 * @version 31/10/2017
 */
public class Censor
{
    /**
     * A list of words that shouldn't be allowed, all lowercase
     */
    private static final String[] BAD_WORDS = {
      "hermes",
      "bridge",
      "muddy",
      "river",
      "assault",
      "offensive"
    };
    
    /**
     * The main function
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            // ask for input
            System.out.print("Enter next sentence: ");
            String input = sc.nextLine();
            // allow to exit
            if (input.equals("exit")) break;
            // print ok or rejected depending on if the text contains bad words
            System.out.println(hasBadWords(input) ? ">>>REJECTED" : ">>>OK");
        }
    }
    
    /**
     * Checks whether a string has bad words
     *
     * @param  s   the string to check
     * @return     true if has, no if not
     */
    public static boolean hasBadWords(String s)
    {
       StringTokenizer sentence = new StringTokenizer(s.toLowerCase());
       // for each word, check if it is in the bad word list
       for (String word = sentence.nextToken(); sentence.hasMoreTokens(); word = sentence.nextToken())
       {
           for (String badWord : BAD_WORDS)
           {
               if (word.equals(badWord)) return true; // true if a bad word is found at any point
           }
       }
       return false; // false otherwise
    }
}
