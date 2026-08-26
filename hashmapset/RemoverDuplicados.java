package hashmapset;

import java.util.HashSet;

public class RemoverDuplicados {
    public HashSet<Integer> removeDuplicados(int[] nums){
        //chave = numero
        //valor = frequencia
        HashSet<Integer> hm = new HashSet<>();

        for(int numero: nums){
            hm.add(numero);
        }

        return hm;
    }

    public static void main(String[] args) {
        RemoverDuplicados rd = new RemoverDuplicados();

        int[] vetor = {1, 2, 6, 6, 2, 2, 3, 4, 5, 5, 6};

        System.out.println(rd.removeDuplicados(vetor));
    }
}
