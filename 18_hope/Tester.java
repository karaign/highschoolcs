
/**
 * The main class
 * 
 * @author Kara I
 * @version 2017-10-13
 */
public class Tester
{
    /**
     * The main function
     */
    public static void main(String args[])
    {
        char ch[] = new char[26];
        // fill the array with characters
        for (int i = 0; i < ch.length; i++)
        {
            ch[i] = (char) (65 + i);
        }
        // print out every character in the array
        for (int i = 0; i < ch.length; i++)
        {
            System.out.print(ch[i]);
            if (i != ch.length - 1) // add a comma unless this was the last char
                System.out.print(", ");
        }
    }

}
