public class TesterQuicksort {
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
        sort(a, 0, a.length - 1);
    }
    
    public static void sort(int a[], int left, int right) {
        // Quicksort
        if (left >= right) return; // base case for when the subarrays have been reduced
                                   // to just 1 element
        int k = left;  // counter variables used to find out-of-order elements
        int j = right;
        int pivot = a[(left + right) / 2];
        // Keep looping until gone through all the out-of-order elements
        while (k < j) {
            // Find a value that is less than the pivot value starting from the left
            while (a[k] < pivot) {
                k++;
            }
            // Find a value that is greater than the pivot value starting from the right
            while (pivot < a[j]) {
                j--;
            }
            // Make sure a[k] and a[j] are out of order
            if (k <= j) {
                int tmp = a[k]; // Swap a[k] and a[j]
                a[k] = a[j];
                a[j] = tmp;
                k++;
                j--;
            }
        }
        // At this point, k and j are the final and initial indices
        // of the 'less-than-pivot' and 'greater-than-pivot' subarrays
        // respectively
        // Repeat the process on both subarrays
        sort(a, left, j);
        sort(a, k, right);
    }
}