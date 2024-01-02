package sort.merge_sort;

import java.util.Arrays;

/*
*  space complexoty is o(n) : every time we create new instance to store sorted array
* time complexity : breakina a part is 0(log n) and putting it back is o(n)
*                   :> o(n log n)
*
* */

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }

    public static int[] merge(int[] arr1, int[] arr2)
    {
        int[] combined = new int[arr1.length + arr2.length];
        int index = 0;
        int i=0;
        int j= 0;

        while (i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                combined[index] =arr1[i];
                index++;
                i++;
            }
            else
            {
                combined[index]=arr2[j];
                index++;
                j++;
            }
        }
        while (i<arr1.length)
        {
            combined[index] = arr1[i];
            index++;
            i++;
        }
        while (j<arr2.length)
        {
            combined[index] = arr2[j];
            index++;
            j++;
        }
        return  combined;
    }

    public static int[] mergeSort(int[] arr)
    {
        if (arr.length == 1) return arr;

        int midIndex = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(arr,midIndex,arr.length));

        return  merge(left,right);

    }
}
