public class TesterMerge {
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
        // Merge sort
        if (right == left) return;     // Base case: the subarray is 1 element long
        int middle = (left + right)/2; // Split the array in 2 halves
        sort(a, left, middle);         // Sort the 2 subarrays recursively
        sort(a, middle + 1, right);
        merge(a, left, middle, right); // Merge the 2 sorted subarrays into a larger sorted subarray.
    }
    
    public static void merge(int a[], int left, int middle, int right) {
        int[] merged = new int[right - left + 1]; // a temporary array to build the merged list
        int iLeft = left; // iterator variable for left sublist
        int iRight = middle + 1; // iterator variable for right sublist
        int lastIndex = 0; // counts the elements in merged
        // Loop through 2 sublists at once, comparing their elements and putting
        // the smaller one into the merged array
        // The iterator variable is advanced for whatever sublist has the smallest value
        while (iLeft <= middle && iRight <= right) {
            merged[lastIndex++] = a[iLeft] < a[iRight] ? a[iLeft++] : a[iRight++];
        }
        // At this point, one of the sublists may not be finished
        // In this case, all of its remaining elements are going to be greater than
        // anything in the other sublist, so we just copy the rest into the merged sublist.
        while (iLeft <= middle) {
            merged[lastIndex++] = a[iLeft++];
        }
        while (iRight <= right) {
            merged[lastIndex++] = a[iRight++];
        }
        // Finally, copy the merged list into the original array.
        for (int i = 0; i < merged.length; i++) {
            a[left + i] = merged[i];
        }
    }
}