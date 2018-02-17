
/**
 * Contains a generic selection sort method that works with any Comparable.
 *
 * @author Kara I
 * @version 2018-02-17
 */
public class GenericSort {
    public static void sort(Comparable[] a) {
        // Selection sort
        for (int i = 0; i < a.length; i++) {
            // The array is divided into the sorted part (left of i)
            // and the unsorted part (from i to the end).
            Comparable min = a[i]; // The first item of the unsorted part is assumed
            int minIndex = i;// to be the smallest (min).
            for (int j = i + 1; j < a.length; j++) {
                // The smallest item of the unsorted part is found.
                if (a[j].compareTo(min) < 0) {
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
