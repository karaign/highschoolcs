import java.util.*;

public class AscendDescend
{
    public static void main (String[] args)
    {
        String[] ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(ss);
        
        System.out.println("Ascend    Descend\n");
        for (int i = 0; i < ss.length; i++) {
            System.out.print(String.format("%1$-10s", ss[i])); // pad and print ith name in the array
            System.out.println(ss[ss.length - 1 - i]); // print ith name from the end and a newline
        }
    }

}
