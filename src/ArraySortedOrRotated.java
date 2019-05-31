public class ArraySortedOrRotated {

    static void sortedAndRotated(int arr[], int n){

        int max_Element = Integer.MIN_VALUE;
        int min_Element = Integer.MAX_VALUE;
        int min_index = -1;

        // find the minimumElement and its index

        for (int i = 0; i<n ; i++){

            if (arr[i]< min_Element){
                min_Element = arr[i];
                min_index = i;
            }
        }

        //check if elements before min_index is in increasing order
        boolean flag1 = true;

        for (int i = 1; i< min_index ; i++){
            if (arr[i] < arr[i-1]){
                flag1 =false;
                break;
            }
        }

        //check if elements after minimum element in increasing order

        boolean flag2= true;

        for (int i = min_index +1; i< n; i++){
            if (arr[i]<arr[i-1]){
                flag2 = false;
                break;
            }
        }

        if (flag1 && flag2 && (arr[n-1]< arr[0])){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }


    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 2 };

        int n = arr.length;

        sortedAndRotated(arr,arr.length);
    }

}
