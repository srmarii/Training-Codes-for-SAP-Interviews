package again;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoverDuplicados {

    public ArrayList<Integer> removeDuplicates(int nums[]){
        Arrays.sort(nums);
        int tam = nums.length, k= 1, newNums[] = new int[tam];
        newNums[0] = nums[0];

        for(int i = 1; i<tam; i++){
            if(nums[i] != nums[i-1]){
                newNums[k] = nums[i];
                k++;
            }
        }

        // return newNums;

        // adicional
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 1; i<tam; i++){
            if(newNums[i] != 0){
                array.add(newNums[i]);
            }
        }

        return array;
    }

    public static void main(String[] args) {
        RemoverDuplicados rd = new RemoverDuplicados();
        int nums[] = {6, 5, 3, 5, 5, 6, 7, 3, 7, 5, 8, 8, 1, 2, 4, 56, 2, 3, 4, 6, 8};
        System.out.println(rd.removeDuplicates(nums));
    }

}