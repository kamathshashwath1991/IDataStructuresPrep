package hashing;

import java.util.HashMap;
import java.util.Map;

public class countFrequencies {

    HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();

     void getFrequencies(int arr[], int n){

        for (int i = 0; i< n;i++){

            if (hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else {
                hm.put(arr[i],1);
            }

        }

        for (Map.Entry entry : hm.entrySet()){
            System.out.println("key" + entry.getKey() + "Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,2,1};

        countFrequencies cf = new countFrequencies();
        cf.getFrequencies(arr,arr.length);
    }
}
