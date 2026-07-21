package hashmapset;

import java.util.Arrays;
import java.util.HashSet;

/*
Two Sum — retorna os valores, não os índices
Igual ao TwoSum, mas em vez de retornar os índices, retorne os dois números que somam o target.
Input:  nums = [3, 5, 2, 8, 1], target = 10  → Output: [2, 8]
*/

//using HASH SET
public class TwoSumValues {
    public int[] whichIsTheTwoNums(int nums[], int target){
        int tam = nums.length, twoNums[] = new int[2];

        //chave = numero
        HashSet<Integer> hm = new HashSet<>();

        for(int i = 0; i<tam; i++){
            int complemento = target - nums[i];

            if(hm.contains(complemento)){
                twoNums[0] = nums[i];
                twoNums[1] = complemento;
                return twoNums;
            } else{
                hm.add(nums[i]);
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        TwoSumValues tsv = new TwoSumValues();
        int nums[] = {2, 2, 4, 3, 5};
        System.out.println(Arrays.toString(tsv.whichIsTheTwoNums(nums, 5)));
    }
}
