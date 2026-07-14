package again;

import java.util.HashMap;

public class SingleNumberHashMap {
    public int whichIsTheSingle(int nums[]){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int numero: nums){
            hm.put(numero, hm.getOrDefault(numero, 0)+1);
        }

        for(int chave: hm.keySet()){
            if(hm.get(chave) == 1){
                return chave;
            }
        }

        return -1;
    }

 
    public static void main(String[] args) {
        SingleNumberHashMap s = new SingleNumberHashMap();
        int[] nums = {4, 4, 9, 1, 2, 1, 2};

        System.out.println(s.whichIsTheSingle(nums));
    }
}
