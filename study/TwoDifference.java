package study;

import java.util.Arrays;
import java.util.HashMap;

//return the two indexes which subtrated they equals to target
public class TwoDifference {
    public int[] twoDifference(int nums[], int target){

        //key = nums
        //value = indexes
        HashMap<Integer, Integer> hm = new HashMap<>();

        int complement = 0, twoNums[] = new int[2];

        for(int i = 0; i<nums.length; i++){
            complement = nums[i] - target;

            if(hm.containsKey(complement)){
                twoNums[0] = hm.get(complement);
                twoNums[1] = i;
            } else{
                hm.put(nums[i], i);
            }

        }

        return twoNums;

    }

    public static void main(String[] args) {
        TwoDifference td = new TwoDifference();

        int[] nums = {1, 2, 3, 4, 5, 7};
        System.out.println(Arrays.toString(td.twoDifference(nums, 5)));
    }
}
