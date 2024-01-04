package sort.quick_sort;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {4,6,1,7,3,2,5};
        quickSort(arr,0,6);
        System.out.println(Arrays.toString(arr));

    }

    private   static void swap(int[] arr, int firstIndex,int secondIndex)
    {
        int tem = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = tem;
    }

    private  static int pivot(int[] arr, int pivotIndex,int endIndex)
    {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex+1;i<=endIndex;i++)
        {
            if(arr[i]<arr[pivotIndex])
            {
                swapIndex++;
                swap(arr,swapIndex,i);
            }
        }
        swap(arr,pivotIndex,swapIndex);
        return swapIndex;
    }

    public  static  void quickSort(int[] arr, int left, int rigth)
    {
        if (left < rigth)
        {
            int pevotIndex = pivot(arr, left, rigth);
            swap(arr,left,pevotIndex-1);
            swap(arr,pevotIndex+1,rigth);
        }
    }
}
