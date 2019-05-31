package hashing;

import java.util.HashMap;
import java.util.Map;

public class SubArraysWithEqualZeronOne {

    static void getSubArray(int arr[], int n){

        Map<Integer,Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        for (int i= 0; i< arr.length; i++){
            if (arr[i] == 0){
                arr[i] = -1;
            }

            sum += arr[i];

            if (sum == 0){
                count++;
            }

            if (map.containsKey(sum)){

            }

            if (!map.containsKey(sum)){
                map.put(sum,1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,0,0,1,0,1,1};

    }
}
