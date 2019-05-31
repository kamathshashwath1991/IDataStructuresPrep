import java.util.Arrays;

public class InsertAtTheEnd
{

    public static void main(String[] args) {
        int [] arr= {1,2,3};

        arr = Arrays.copyOf(arr,arr.length+1);

        arr[arr.length-1] = 4;

        System.out.println(args);

    }
}
