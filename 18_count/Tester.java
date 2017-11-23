import java.util.*;
public class Tester
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("Type in a sentence and press ENTER.");
            String line = sc.nextLine().toUpperCase(); // scan the line and make it case insensitive
            if (line.equals("EXIT")) break;
            line = line.replaceAll("\\s", ""); // ignore all whitespace
            line += "\n"; // extra whitespace to catch the last delimiter, if any
            String sp[] = line.split("SA");
            System.out.println("There are " + (sp.length - 1) + " occurences.");
        }

    }
}
