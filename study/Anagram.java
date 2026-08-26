package study;

import java.util.HashMap;

public class Anagram {
    public static void main(String args[]) {
 
      //pass
      String result1 = isAnagram("sap", "pas") ? "Pass": "Fail"; //pass
      System.out.println(result1);
      //fail
      String result2 = isAnagram("anagram", "nagaram") ? "Pass": "Fail"; //pass
      System.out.println(result2);
      //fail
      String result3 = isAnagram("car", "rat") ? "Pass" : "Fail"; //fail
      System.out.println(result3);
      String result4 = isAnagram("", "") ? "Pass" : "Fail"; //fail
      System.out.println(result4);
      String result5 = isAnagram("", "house") ? "Pass": "Fail"; //fail
      System.out.println(result5);
      String result6 = isAnagram("house", "") ? "Pass": "Fail"; //fail
      System.out.println(result6);
  }

    public static boolean isAnagram(String word1, String word2){

        //key = letter
        //value = frequency
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        int tam1 = word1.length(), tam2 = word2.length();

        if(tam1 == tam2 && tam1 > 1){
            for(int i = 0; i<tam1; i++){
                Character currentlyChar = word1.charAt(i);
                hm1.put(currentlyChar, hm1.getOrDefault(currentlyChar, 0) + 1);
            }

            for(int i = 0; i<tam1; i++){
                Character currentlyChar = word2.charAt(i);
                hm2.put(currentlyChar, hm2.getOrDefault(currentlyChar, 0) + 1);
            }

            return hm1.equals(hm2);
        } else{
            return false;
        }

    }
}
