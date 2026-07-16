package again;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumHashMap {
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

        //ou...
        // int tam = nums.length, twoNums[] = new int[2];

        // for(int i = 0; i < tam; i++){
        //     int par = target - nums[i];
        //     if(vistos.containsKey(par)){
        //         twoNums[0] = vistos.get(par);
        //         twoNums[1] = i;
        //         return twoNums;
        //     } else {
        //         vistos.put(nums[i], i);
        //     }
        // }

        // return nums;
    }

    public static void main(String[] args) {
        TwoSumHashMap ts = new TwoSumHashMap();
        int nums[] = {2, 2, 4, 3, 5};
        System.out.println(Arrays.toString(ts.twoNumbers(nums, 4)));
    }
}
