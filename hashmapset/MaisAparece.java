package hashmapset;

import java.util.HashMap;

public class MaisAparece {
    public int whichMostAppears(int[] nums){
        //chave = numero
        //valor = frequencia
        int maiorFreq = 0, maisAparece = -1;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int numero: nums){
            hm.put(numero, hm.getOrDefault(numero, 0) + 1);
        }

        for(int chave: hm.keySet()){
            int frequencia = hm.get(chave);

            if(frequencia > maiorFreq){
                maiorFreq = frequencia;
                maisAparece = chave;
            }
        }


        return maisAparece;
    }

    public static void main(String[] args) {
        MaisAparece ma = new MaisAparece();

        int[] nums = {2, 2, 2, 4, 5, 5, 4, 4, 4, 7, 9, 9, 9, 2, 4, 3, 4};

        System.out.println(ma.whichMostAppears(nums));
    }
    
}
