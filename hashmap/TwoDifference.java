package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoDifference {
    //Dado um array e um alvo, retorne os dois índices que somam o alvo
    public int[] whichIsTheTwoNumbers(int[] nums, int target){
        int tam = nums.length, complemento = 0, twoNums[] = new int[2];

        //chave = numero
        //valor = indice
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i<tam; i++){
            complemento = nums[i] - target;
            if(hm.containsKey(complemento)){
                twoNums[0] = hm.get(complemento);
                twoNums[1] = i;

                return twoNums;
            } else{
                hm.put(nums[i], i);
            }
        }


        return nums;
    }

    public static void main(String[] args) {
        TwoDifference td = new TwoDifference();

        int[] vetor = {1, 2, 3, 4, 5, 7};
        int target = 5;

        int[] resultado = td.whichIsTheTwoNumbers(vetor, target);

        System.out.println(Arrays.toString(resultado));
    }
}
