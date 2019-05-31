public class LeadersInArray {


    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int n = arr.length;
        int Max_from_right = arr[n-1];

        System.out.println("max from right will be always last element: " + Max_from_right);

        for (int i = n-2;i>0; i--){

            if (Max_from_right < arr[i]){
                Max_from_right = arr[i];
                System.out.println(arr[i]);
            }
        }
    }
}
