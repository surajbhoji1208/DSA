package hashTable;

import java.util.HashMap;

public class hashInterview1 {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5,3};
        System.out.println(itemInCommon(arr1,arr2));

    }

    public static boolean itemInCommon(int[] arr1,int[] arr2)
    {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int i:arr1)
        {
            hashMap.put(i,true);
        }
        for (int j:arr2)
        {
            if (hashMap.get(j) !=null) return true;
        }

        return false;
    }

}
