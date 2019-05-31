package hashing;

import java.util.HashSet;

public class FirstRepeatingElement {

    static void printFirstRepeating(int arr[]){

        HashSet<Integer> hs = new HashSet<>();

        int min = -1;
        for (int i = arr.length-1; i>=0; i--){

            if (hs.contains(arr[i])){
                min =i;
            }

            else{
                hs.add(arr[i]);
            }
        }

        if (min!= -1){
            System.out.println(arr[min]);
        }
    }


    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        printFirstRepeating(arr);
    }
}
