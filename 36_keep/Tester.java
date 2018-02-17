import java.util.Scanner;
import java.io.IOException;

public class Tester
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type exit to exit");
        while (true)
        {
            String next = sc.next();
            if (next.equals("exit"))
            {
                System.out.println("It didn't work");
                break;
            }
            
            try {
                FileInput.readTheFile(next);
                System.out.println("It worked");
                break;
            } catch (IOException e) {
                continue;
            }
        }
    }
}
