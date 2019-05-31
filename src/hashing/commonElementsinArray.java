package hashing;

import java.net.Inet4Address;
import java.util.HashSet;

public class commonElementsinArray {


    static void findCommonElements(int arr1[], int arr2[],int n1,int n2){
        HashSet<Integer> hs = new HashSet<>();

        for (int i= 0; i<n1; i++){
            hs.add(arr1[i]);
        }

        for (int i =0;i<n2;i++){
            if (hs.contains(arr2[i])){
                System.out.println(arr2[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr1[]= {89,24,75,11,23};
        int arr2[] = {89,2,4,24};

        int n1 = arr1.length; int n2= arr2.length;

        findCommonElements(arr1,arr2,n1,n2);
    }
}
