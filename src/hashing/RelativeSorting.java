package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RelativeSorting {

    static void doRelativeSorting(int arr1[], int arr2[]){
        Map<Integer, Integer> hm = new TreeMap<Integer,Integer>();
        int m = arr1.length;
        int n= arr2.length;

        for (int i = 0; i< m; i++){

            if(hm.get(arr1[i]) == null){
                hm.put(arr1[i],0);
            }
            else{
                int c = hm.get(arr1[i]) +1;
                hm.put(arr1[i],c);
            }
        }

        int result[] = new int[m];
        int j = 0;

        for (int i =0; i<n; i++){
            if (hm.containsKey(arr2[i])){
                int co = hm.get(arr2[i]);

                while (co > 0){
                    result[j] = arr2[i];
                    j++;
                    co --;
                }

                hm.remove(arr2[i]);
            }
        }

        for (Map.Entry<Integer,Integer> entry : hm.entrySet()){

        }
    }

    public static void main(String[] args) {
        int A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8, 7, 5, 6, 9, 7, 5};

        int A2[] = {2, 1, 8, 3, 4};

        doRelativeSorting(A1,A2);
    }
}
