import java.io.*;
import java.util.*;
/**
 * The main class for a program that reads a file and prints out the lines that start with "The".
 * 
 * @author Kara I
 * @version 03/11/2017
 */
public class FileNerd
{
    public static void main (String[] args) throws IOException 
    {
        Scanner sc = new Scanner(new File("U:\\CS\\NerdData.txt"));
        
        while (sc.hasNext()) {
            String next = sc.nextLine();
            if (next.startsWith("The"))
                System.out.println(next);
        }
    }
}
