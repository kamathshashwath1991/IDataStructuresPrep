package sorting;

public class InversionArray {


    static int sort(int arr[], int low,int high){
        int pivot = arr[high];
        int i = low-1;


        for (int j = low; j< arr.length; j++){
            if (arr[j] <= pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        return i;
    }


    public static void main(String[] args) {
        int [] arr = {4,5,1,2,3};
        int count = sort(arr,0,arr.length-1);
        System.out.println(count);
    }
}
