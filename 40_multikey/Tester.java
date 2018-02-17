import java.io.*; //necessary for File and IOException
import java.util.*; //necessary for StringTokenizer and Scanner

public class Tester
{
    public static void main(String args[]) throws IOException
    {
        Scanner sf = new Scanner(new File("../data/Names_ages.txt"));
        int maxIndx = -1; //-1 so when we increment below, the first index is 0
        String text[] = new String[1000]; //To be safe, declare more than we need
        while (sf.hasNext())
        {
            maxIndx++;
            text[maxIndx] = sf.nextLine();
        }
        // maxIndx is now the highest index of text[].Equals - 1 if no text lines
        sf.close(); //We opened a file above, so close it when finished.
        
        // Store all the entries in an array
        Person people[] = new Person[maxIndx + 1];
        int maxIndxP = 0;
        for (int j = 0; j <= maxIndx; j++)
        {
            Scanner sc = new Scanner(text[j]);
            String name = sc.next();
            int age = sc.nextInt();
            people[maxIndxP++] = new Person(name, age);
        }
        // Sort the array
        GenericSort.sort(people);
        // Print the sorted array
        for (Person p : people)
        {
            System.out.println(p.getName() + ", " + p.getAge());
        }
    }
}