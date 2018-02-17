public class TesterSelection {
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
        // Selection sort
        for (int i = 0; i < a.length; i++) {
            // The array is divided into the sorted part (left of i)
            // and the unsorted part (from i to the end).
            int min = a[i]; // The first item of the unsorted part is assumed
            int minIndex = i;// to be the smallest (min).
            for (int j = i + 1; j < a.length; j++) {
                // The smallest item of the unsorted part is found.
                if (a[j] < min) {
                    min = a[j];
                    minIndex = j;
                }
            }
            // The first item in the unsorted part is swapped with the min.
            a[minIndex] = a[i];
            a[i] = min;
        }
    }
}