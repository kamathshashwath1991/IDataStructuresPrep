package hashing;

import java.util.HashMap;

public class ArraysEqualOrNot {

    static void checkIfArraySame(int arr1[], int arr2[]){

        HashMap<Integer, Integer> hm1 = new HashMap<Integer,Integer>();
        HashMap<Integer, Integer> hm2 = new HashMap<Integer,Integer>();

        if ((arr1.length<arr2.length) || (arr1.length>arr2.length)){
            return;
        }

        if (arr1.length == arr2.length){

            for (int i= 0; i< arr1.length;i++){

                if (hm1.containsKey(arr1[i])){
                    hm1.put(arr1[i],hm1.get(arr1[i])+1);
                }

                hm1.put(arr1[i],0);
            }

            for (int i= 0; i< arr2.length;i++){

                if (hm2.containsKey(arr2[i])){
                    hm2.put(arr2[i],hm2.get(arr2[i])+1);
                }

                hm2.put(arr2[i],0);
            }

            System.out.println(hm1.equals(hm2));
        }

    }


    public static void main(String[] args) {
       int A[] = {1, 2, 5, 4, 0}; int B[] = {2, 4, 5, 0, 2};

       checkIfArraySame(A,B);
    }
}
