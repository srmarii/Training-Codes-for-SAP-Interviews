package study;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    //numbers = [1,2,3,4,5]
    //target = 9
    public int[] whichAreTheTwoIndexes(int numbers[], int target){
        //key = numero
        //value = index
        HashMap<Integer,Integer> numbersHash = new HashMap<>();
        int complemento, twoNumbers[] = new int[2];

        for(int i = 0; i<numbers.length; i++){
            numbersHash.put(numbers[i], i);
        }

        for(int j = 0; j<numbers.length; j++){
            complemento = target - numbers[j];

            if(numbersHash.containsKey(complemento)){
                twoNumbers[0] = numbersHash.get(numbers[j]);
                twoNumbers[1] = numbersHash.get(complemento);
                break;
            }
        }

        return twoNumbers;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int numbers[] = {1,2,3,4,5};

        //[3,4]
        System.out.println(Arrays.toString(twoSum.whichAreTheTwoIndexes(numbers, 9)));
    }
}
