package interviews;

import java.util.HashMap;

/*
ParseInt - Write a function that takes in a string parameter and converts it into an integer, but only if it is indeed an integer. Do not use Integer.parseInt() or similar.
*/
public class ParseInt {
    public int returnInteger(String numberString) {
        int lenght = numberString.length(), numberInt = 0;
        char currentCharacter = ' '; 
    
        //key = numberString
        //value = numberInt
        HashMap<String, Integer> hashMap = new HashMap<>();
    
        if(!numberString.contains("a" || !numberString.contains("A") ... )){
    
            hashMap.put("0", 0);
            hashMap.put("1", 1);
            hashMap.put("2", 2);
            hashMap.put("3", 3);
            hashMap.put("4", 4);
            hashMap.put("5", 5);
            hashMap.put("6", 6);
            hashMap.put("7", 7);
            hashMap.put("8", 8);
            hashMap.put("9", 9);
            
            
            for(int i = 0; i < lenght; i++){
                currentCharacter = numberString.charAt(i);
            
                if(hashMap.containsKey(currentCharacter)){
                    numberInt = (numberInt * 10) + hashMap.get(currentCharacter);
                }
            }
            
            return numberInt;
            
        } else {
            return -1;
        }

    }
}
