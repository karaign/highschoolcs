import java.util.ArrayList;

public class TesterRadixStr {
    public static void main(String args[]) {
        String theArray[] = {
            "DELL",
            "HELP",
            "ALSO",
            "BEAR",
            "BACK",
            "IPAD",
            "IPOD",
            "AGRO"
        };
        sort(theArray);
        for (int j = 0; j < theArray.length; j++) {
            System.out.print(theArray[j] + " ");
        }
        System.out.println(" ");
    }
    
    public static void sort(String a[]) {
        // Radix sort (for strings, descending)
        ArrayList<String>[] lists = new ArrayList[26];
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList<>();
        }
        // Loop through 4 possible character places
        for (int charPos = 3; charPos >= 0; charPos--) {
            // Clear the lists
            for (ArrayList lst : lists) lst.clear();
            // Loop through the array, adding each string to the appropriate list
            for (String s : a) {
                int letter = s.charAt(charPos) - 65;
                lists[letter].add(s);
            }
            // Go backwards through all the lists, copying elements to the original array
            int count = 0;
            for (int j = lists.length - 1; j >= 0; j--) {
                for (String s : lists[j]) {
                    a[count++] = s;
                }
            }
        }
    }
}