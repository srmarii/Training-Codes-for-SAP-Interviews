package hashmapset;

import java.util.Arrays;
import java.util.HashSet;

public class RemoverDuplicados {
    public int[] removeDuplicados(int[] nums){
        int i = 0; 

        //chave = numero
        //valor = frequencia
        HashSet<Integer> hm = new HashSet<>();

        for(int numero: nums){
            hm.add(numero);
        }

        int listaSemDuplicados[] = new int[hm.size()];
        
        for(int numero: hm){
            listaSemDuplicados[i] = numero;
            i++;
        }

        return listaSemDuplicados;
    }

    public static void main(String[] args) {
        RemoverDuplicados rd = new RemoverDuplicados();

        int[] vetor = {1, 2, 6, 6, 2, 2, 3, 4, 5, 5, 6};
        int[] resultado = rd.removeDuplicados(vetor);

        System.out.println(Arrays.toString(resultado));
    }
}
