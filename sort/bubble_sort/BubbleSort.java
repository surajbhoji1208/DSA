package sort.bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3,4,5,62,3,5,78,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public  static void bubbleSort(int[] arr)
    {
        for(int i=arr.length-1;i> 0;i--)
        {
            for (int j=0;j<i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }


    }
}
