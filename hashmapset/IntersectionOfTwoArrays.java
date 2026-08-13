package hashmapset;

import java.util.HashSet;

/*
------ [ ] Intersection of Two Arrays
Dados dois arrays, retorne um array com os elementos que aparecem nos dois.
Input:  [1, 2, 2, 3, 4],  [2, 2, 5, 4]  → Output: [2, 4]  (sem duplicatas no resultado)
*/
public class IntersectionOfTwoArrays {
    public HashSet<Integer> whichIsTheThirdArray(int array1[], int array2[]){
        //array1 pra buscar linearmente
        HashSet<Integer> hs = new HashSet<>();

        //retorno para garantir que nao haja repeticoes
        HashSet<Integer> intersecao = new HashSet<>();

        for(int num: array1){
            hs.add(num);
        }

        for(int i = 0; i < array2.length; i++){
            if(hs.contains(array2[i])){
                intersecao.add(array2[i]);
            }
        }


        return intersecao;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays iota = new IntersectionOfTwoArrays();

        int array1[] = {1, 2, 2, 3, 4};
        int array2[] = {2, 2, 5, 4};

        System.out.println(iota.whichIsTheThirdArray(array1, array2));

    }
}
