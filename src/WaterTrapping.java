public class WaterTrapping {




    static int findWater(int[] arr,int n){

        int result =0;

        int left_max=0, right_max = 0, left=0, right=n-1;

        while (left<right){

            if (arr[left]<arr[right]){

                if (arr[left] > left_max){
                    left_max = arr[left];
                }
                else {
                    result+= left_max-arr[left];
                    left++;
                }

            }

            else {
                if (arr[right] > right_max ){
                    right_max = arr[right];
                }
                else {
                    result+= right_max-arr[right];
                    right --;
                }
            }

        }

        return result;
    }



    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1,
                3, 2, 1, 2, 1};
        int n = arr.length;

        System.out.println("Maximum water that "
                + "can be accumulated is "
                + findWater(arr, n));

    }
}
