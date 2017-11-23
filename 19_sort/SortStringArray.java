import java.util.*;

public class SortStringArray
{
    public static void main (String[] args)
    {
        String[] ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(ss);
        
        for (String name : ss)
            System.out.println(name);
    }

}
