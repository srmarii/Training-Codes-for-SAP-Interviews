package study;

/* # Distinct Substring
You receive a string of N letters (7 ≤ N ≤ 1000).
You need to find the first sequence of 7 distinct characters and return its position.
The string starts at position 0. If the sequence is not found, return -1.

## Examples
Input string:
ABCDEFGHIJ
└─────┘

Output: `0`
---
Input string:

ABCABCDEFGHIJABCDEFGHIJ
   └─────┘

Output: `3`
---
Input string:

AABBCCDDEEFF

Output: `-1`
*/

public class SubstringBRUNO {
    public int whichIsTheSubstring(String word){
        String subString = "" + word.charAt(0);
        int index;

        for(int i = 1; i<word.length(); i++){
            String currentChar = "" + word.charAt(i);
            if(!subString.contains(currentChar)){
                subString += currentChar;
            } else{
                subString = currentChar;
            }

            if(subString.length() == 7){
                index = word.indexOf(subString);
                return index;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        SubstringBRUNO sb = new SubstringBRUNO();

        System.out.println(sb.whichIsTheSubstring("ABCDEFGHIJ"));
        System.out.println(sb.whichIsTheSubstring("ABCABCDEFGHIJABCDEFGHIJ"));
        System.out.println(sb.whichIsTheSubstring("AABBCCDDEEFF"));
    }
}
