public class TesterBubble {
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
        // Bubble sort
        boolean swapped; // keep track of whether a swap occured this iteration
        do {
            swapped = false;
            for (int i = 0; i < a.length - 1; i++) { // compare pairs of neighbouring items
                if (a[i] > a[i + 1]) { // if pair out of order, swap
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    swapped = true;
                }
            }
        } while (swapped); // continue until no swaps occur
    }
}