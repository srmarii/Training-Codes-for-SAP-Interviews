package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoNumbers(int[] nums, int target){
        // chave = complemento
        // valor = indice
        HashMap<Integer, Integer> compIndice = new HashMap<>();
        int tam = nums.length, twoNums[] = new int[2];

        for(int i = 0; i<tam; i++){
            if(compIndice.containsKey(nums[i])){
                twoNums[0]= compIndice.get(nums[i]);
                twoNums[1]= i;

                return twoNums;

            } else{
                int complemento = target - nums[i];
                compIndice.put(complemento, i);
            }
    }

        return nums;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int nums[] = {2, 2, 4, 3, 5};
        System.out.println(Arrays.toString(ts.twoNumbers(nums, 4)));
    }
}
