/*
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 
Write a method that two strings and compare them to checks if the first string is a anagram of second string.
*/
 
import java.lang.*;
 
public class AAATest {
 
  public static void main(String args[]) {
 
      String result1 = isAnagram("sap", "pas") ? "Pass": "Fail";
      System.out.println(result1);
 
      String result2 = isAnagram("anagram", "nagaram") ? "Pass": "Fail";
      System.out.println(result2);
      String result3 = isAnagram("car", "rat") ? "Fail" : "Pass";
      System.out.println(result3);
      String result4 = isAnagram("", "") ? "Fail" : "Pass";
      System.out.println(result4);
      String result5 = isAnagram("", "house") ? "Fail": "Pass";
      System.out.println(result5);
      String result6 = isAnagram("house", "") ? "Fail": "Pass";
      System.out.println(result6);
  }


  public static boolean isAnagram(String s1, String s2) {
      String word = "";
      char aux;
      Boolean anagram = false;
      char[] charS1 = s1.toCharArray();
      int tam1 = s1.length(), tam2 = s2.length();

      if(tam1 != tam2){
        return false;
      } else{
            for(int i = 0; i<tam1; i++){
                aux = s2.charAt(i);
                    // if( s1.contains(aux) == false){
                    //     return false;
                    // } else {
                    //    anagram = true;
                    // }
            }

      }




      return false;
  }
}