public class TesterInsertion {
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
        // Insertion sort
        int toInsert, j; // j is used to iterate backwards through the sorted part
        boolean keepGoing;
        // for every ith pass, get a[i] and put it into the correct position
        // among the first i items
        for (int i = 0; i < a.length; i++) {
            toInsert = a[i];
            j = i - 1;
            // Go backwards through the sorted part, looking for the index where
            // toInsert belongs
            while (j >= 0) {
                if (toInsert < a[j]) {
                    // If toInsert is less than the item in this slot
                    // shift the latter to the right and keep going
                    a[j + 1] = a[j];
                    j--;
                    if (j == -1) {
                        a[0] = toInsert;
                    } // special case to insert at 0
                } else {
                    // Finally, toInsert is greater than j
                    // and so it's inserted at j + 1
                    a[j + 1] = toInsert;
                    break;
                }
            }
        }
    }
}