package hashing;

import java.util.HashSet;

public class HashingForPair {


    static void findPair (int arr[], int target){
        HashSet<Integer> hs = new HashSet<>();

        for (int i =0; i< arr.length;i++){
            if (hs.contains(target-arr[i])){
                System.out.println("pair"+ arr[i] +"," + (target-arr[i]));
            }
            hs.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9,10};
        int target = 14;

        findPair(arr1,target);
    }
}
