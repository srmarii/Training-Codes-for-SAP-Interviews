package hashmapset;
import java.util.HashMap;

/*
------ [ ] Contains Duplicate
Dado um array, retorne true se algum número aparecer mais de uma vez.
Input:  [1, 2, 3, 4]  → false
Input:  [1, 2, 3, 1]  → true
*/
public class Duplicate {
    public boolean containsDuplicate(int nums[]){
        //chave = numero
        //value = quantas vezes aparece
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int num: nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for(int chave: hm.keySet()){
            int frequencia = hm.get(chave);

            if(frequencia > 1){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Duplicate d = new Duplicate();
        int nums[] = {1, 2, 3, 1};

        System.out.println(d.containsDuplicate(nums));
    }
}