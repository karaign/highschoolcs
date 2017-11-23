import java.io.*;
import java.util.*;
public class Tester
{
    public static void main(String args[])
    {
        final String SIGN_REGEX = "\\s*[\\+\\-]\\s*";
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter something like 8 + 33 + 1,345 -137 : ");
        String s = kb.nextLine(); //Best to store in a String and then create a new Scanner
        //object; otherwise, it can get stuck waiting for input.
        Scanner sc = new Scanner(s);

        int sum = 0;
        while (true)
        {
            int sgn = 1; // should the next number be positive (1) or negative (-1)
            if (sc.hasNext(SIGN_REGEX)) // get the next sign if any
            {
                String signStr = sc.next(SIGN_REGEX).trim();
                if (signStr.equals("-"))
                    sgn = -1; // negate the next number if the sign is "-" and not "+"
            }
            if (sc.hasNextInt()) { // get the next number if any
                int nextInt = sc.nextInt();
                sum += sgn * nextInt; // if the sign was a minus, the number is negated
            }
            else { // if there's no more numbers, stop the loop
                break;
            }
        }
        System.out.println("Sum is: " + sum);
    }
}