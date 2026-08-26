package study;

import java.util.HashMap;

public class MostAppears {
    public int whichMostAppears(int nums[]){

        //key = num
        //value = frequency
        HashMap<Integer, Integer> hm = new HashMap<>();

        int biggestFrequency=0, mostAppearNumber=-1;

        for(int n: nums){
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        for(int key: hm.keySet()){
            int currentlyFrequency = hm.get(key); 
            if(currentlyFrequency > biggestFrequency){
                biggestFrequency = currentlyFrequency;
                mostAppearNumber = key;
            }

        }


        return mostAppearNumber;
    }

    public static void main(String[] args) {
        MostAppears ma = new MostAppears();
        int nums[] = {1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5};
        System.out.println(ma.whichMostAppears(nums));
    }
}
