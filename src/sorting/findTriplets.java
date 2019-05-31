package sorting;

import java.util.Arrays;

public class findTriplets {

    static void find(int arr[], int n){

        Arrays.sort(arr);

        boolean found = false;

        for (int i = 0; i< arr.length-1; i++){

            int l = i+1;
            int r = n-1;
            int x = arr[i];

            while (l<r){
                if (x + arr[l] + arr[r] == 0){
                    System.out.println(x + " ");
                    System.out.println(arr[l] + " ");
                    System.out.println(arr[r] + " ");

                    l++;
                    r--;
                    found = true;
                }

                else if (x + arr[l] + arr[r] < 0){
                    l++;
                }

                else {
                    r--;
                }
            }

        }

        if (found == false){
            System.out.println("No triplet found");
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        int n =arr.length;

        find(arr,arr.length);
    }
}
