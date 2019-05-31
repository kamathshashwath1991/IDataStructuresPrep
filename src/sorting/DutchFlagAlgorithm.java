package sorting;

public class DutchFlagAlgorithm {


    static void sort(int[] arr, int lowIndex, int highIndex){

        if (highIndex <= lowIndex){
            return;
        }

        int start = lowIndex;
        int end = highIndex;
        int i = lowIndex;
        int pivot = arr[lowIndex];

        while (i <= end){
            if (arr[i] < pivot){
                swap(arr,i,start);
            }
            else if (arr[i] > pivot){
                swap(arr,i,end);
                end --;
            }
            else {
                i++;
            }
        }

        sort(arr,lowIndex,start-1);
        sort(arr,end+1,highIndex);
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int arr[] = {0,1,2,1,1,0,0,2,0,1};
        sort(arr,0,arr.length-1);
        for (int i = 0; i<arr.length-1;i++){
            System.out.println(arr[i] + " ");
        }
    }


}
