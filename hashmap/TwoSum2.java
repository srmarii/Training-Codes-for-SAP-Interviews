package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum2 {
    public int[] twoNumbers(int[] nums, int target){
        //chave = numero
        //valor = indice
        int complemento, twoNums[] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
    
            complemento = target - nums[i];

            if(hm.containsKey(complemento)){
                twoNums[0] = hm.get(complemento);
                twoNums[1] = i;

                return twoNums;

            } else {
                hm.put(nums[i], i);
         
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        TwoSum2 ts = new TwoSum2();
        int nums[] = {4, 4, 3, 7};
        System.out.println(Arrays.toString(ts.twoNumbers(nums, 10)));
    }
}
