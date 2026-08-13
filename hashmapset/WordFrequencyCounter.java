package hashmapset;

import java.util.HashMap;

/*
------ [ ] Word Frequency Counter
Dada uma frase (String), retorne qual palavra aparece mais vezes.
Input:  "the cat sat on the mat the cat"  → Output: "the"
*/

public class WordFrequencyCounter {
    public String whichWordMostAppears(String palavra){
        int maiorFrequencia = 0;
        String maisAparece = "", palavraAtual = "";;

        //palavra, frequencia
        HashMap<String, Integer> hm = new HashMap<>();

        for(int i = 0; i < palavra.length(); i++){
            if(palavra.charAt(i) != ' '){
                palavraAtual += palavra.charAt(i);
            } else{
                hm.put(palavraAtual, hm.getOrDefault(palavraAtual, 0) + 1);
                palavraAtual = "";
            }
        }
        //para incluir a ultima palavra pois ela esta em palavraAtual, mas nunca entra no else porque nao tem espaco
        hm.put(palavraAtual, hm.getOrDefault(palavraAtual, 0) + 1);

        for(String chave: hm.keySet()){
            if(hm.get(chave) > maiorFrequencia){
                maiorFrequencia = hm.get(chave);
                maisAparece = chave;
            }
        }

        return maisAparece;
    }

    public static void main(String[] args) {
        WordFrequencyCounter wfc = new WordFrequencyCounter();

        System.out.println(wfc.whichWordMostAppears("the cat sat on the mat the cat"));
    }
}
