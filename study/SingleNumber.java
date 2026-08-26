package study;

import java.util.HashMap;

public class SingleNumber {
    public int whichIsTheSingleNumber(int nums[]){
        
        //key = nums
        //value = frequency
        HashMap<Integer, Integer> hm = new HashMap<>();

        //iterate through an array of numbers
        for(int num: nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for(int key: hm.keySet()){
            if(hm.get(key) == 1){
                return key;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber(); 

        int nums[] = {2, 2, 3, 3, 6, 4, 5, 5, 4};
        System.out.println(sn.whichIsTheSingleNumber(nums));
    }
}
