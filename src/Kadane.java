public class Kadane {

    static void maxSubArray(int arr[], int n){
        int max_so_far = Integer.MIN_VALUE,max_ending_here = 0, start=0, end = 0,s=0;

        for (int i =0; i< n; i++){
            max_ending_here = max_ending_here + arr[i];

            if (max_ending_here<0){
                max_ending_here = 0;
                s = i+1;
            }

            if (max_so_far< max_ending_here){
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
        }
        System.out.println("maximum sum so far" + max_so_far);
        System.out.println("Start index " + start);
        System.out.println("Ending Index" + end);
    }


    public static void main(String[] args) {
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = a.length;
        maxSubArray(a,n);
    }
}
