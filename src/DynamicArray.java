import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DynamicArray {


    public int[] twoSum(int[] nums, int target) {

        int result[] = new int[2];

        if (nums == null || nums.length == 0){
            return result;
        }

        HashMap<Integer, Integer> visited = new HashMap<>();

        for (int i= 0; i< nums.length; i++){

            if(visited.containsKey(target-nums[i])){
                result[0]= visited.get(target-nums[i]);
                result[1]= i;
            }

            visited.put(nums[i],i);
        }

        return result;
    }

    public static void main(String[] args) {

        //nums[2, 7, 11, 15], target = 9

        int num[] = {2, 7, 11, 15};
        int target= 9;

        DynamicArray DA= new DynamicArray();

        int Myresult[] = DA.twoSum(num,target);

        System.out.println(Myresult[0]+","+ Myresult[1]);

    }
}
