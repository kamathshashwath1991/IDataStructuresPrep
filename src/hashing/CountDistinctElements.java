package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CountDistinctElements {

   static void getDistinctElements(int arr1[], int n){

       HashSet<Integer> hs = new HashSet<Integer>();
       for (int i =0; i< n-1; i++){

           if (hs.contains(arr1[i])){
               System.out.println(arr1[i]);
           }
           else {
               hs.add(arr1[i]);
           }
       }
   }

    public static void main(String[] args) {
        int arr1[] = {89,24,75,11,23,89,24};
        int n =arr1.length;
        getDistinctElements(arr1,n);
    }
}
