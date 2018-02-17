import java.util.ArrayList;

public class TesterRadixInt {
    public static void main(String args[]) {
        int theArray[] = {
            4,
            2,
            5,
            1,
            3,
            18,
            0,
            9,
            6
        };
        sort(theArray);
        for (int j = 0; j < theArray.length; j++) {
            System.out.print(theArray[j] + " ");
        }
        System.out.println(" ");
    }
    
    public static void sort(int a[]) {
        // Radix sort
        int mask = 1;
        // Loop through 31 bits of the int datatype, ignoring the sign bit
        for (int i = 0; i < 31; i++) {
            ArrayList<Integer> zeroes = new ArrayList<>();
            ArrayList<Integer> ones   = new ArrayList<>();
            // Loop through the array
            for (int j = 0; j < a.length; j++) {
                if ((a[j] & mask) == 0) {
                    zeroes.add(a[j]);
                } else {
                    ones.add(a[j]);
                }
            }
            // Copy zeroes then ones to the original array
            int count = 0;
            for (int n : zeroes) {
                a[count++] = n;
            }
            for (int n : ones) {
                a[count++] = n;
            }
            mask *= 2; // Advance mask to next bit
        }
    }
}