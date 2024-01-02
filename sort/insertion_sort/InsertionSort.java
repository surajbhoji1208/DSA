package sort.insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,5,3,6,7745,3};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr)
    {
        for (int i=1;i< arr.length;i++)
        {
            int temp = arr[i];
            int j = i-1;
            while (j > -1 && temp<arr[j])
            {
                arr[j+1]=arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
