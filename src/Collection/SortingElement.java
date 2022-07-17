package Collection;

import java.util.Arrays;
import java.util.Collections;

//Sort Elements in Array using Built-In Methods
public class SortingElement {
    public static void main(String[] args) {
        //Approach-1
       /* int[] a = {30, 50, 20, 40, 60, 10};
        System.out.println("Array Element Before Sorting:" + Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("Array Element After Sorting:" + Arrays.toString(a));*/
        //Approach-2
        /*int[] a = {30, 50, 20, 40, 60, 10};
        System.out.println("Array Element Before Sorting:" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array Element After Sorting:" + Arrays.toString(a));*/
        //Reverse Descending Order
        Integer[] a = {30, 50, 20, 40, 60, 10};
        System.out.println("Array Element Before Sorting:" + Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Array Element After Sorting:" + Arrays.toString(a));
    }
}
