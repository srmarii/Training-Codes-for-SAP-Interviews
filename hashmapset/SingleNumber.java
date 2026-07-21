package hashmapset;

import java.util.HashMap;

public class SingleNumber {
    public int whichIsTheSingle(int nums[]){
        //chave = numero em si
        //valor = quantas vezes ele apareceu
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int numero: nums){
            hm.put(numero, 
                hm.getOrDefault(numero, 0)
                +1);
        }

        //keySet() retorna todos as chaves do hm
        for(int chave: hm.keySet()){
            if(hm.get(chave) == 1){
                return chave;
            }
        }

        return -1;
    }

 
    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();
        int[] nums = {4, 4, 9, 1, 2, 1, 2};

        System.out.println(s.whichIsTheSingle(nums));
    }
}
