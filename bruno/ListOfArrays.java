package bruno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
You're given a list of strings, and your job is to group all the words that are anagrams of each other.
 
Two words are anagrams if they contain exactly the same characters, just in a different order — like eat and tea, or listen and silent.
 
Your function should return all the groups. The order of the groups doesn't matter, but each group should be sorted alphabetically.
Here's an example to make it concrete:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
Output: [["ate", "eat", "tea"], ["bat"], ["nat", "tan"]]
 
List<List<String>> result = new ArrayList<>();
*/
public class ListOfArrays {
    public List<List<String>> whichIsTheList(String words[]){
        
        //key = word sorted
        //value = String not sorted
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        String newWords[] = new String[words.length];
        String sortedString = "";
        int k = 0; 
        List<List<String>> returnArray = new ArrayList<>();


        for(int i = 0; i < words.length; i++){
          //  sortedString = Arrays.sort(words[i]);

            char[] chars = words[i].toCharArray();
            Arrays.sort(chars);
            sortedString = new String(chars);

            ArrayList<String> array = new ArrayList<>();
            ArrayList<String> newArray = new ArrayList<>();


            array.add(words[i]);
            if(!hm.containsKey(sortedString)){
                hm.put(sortedString, array);
                k++;
            } else{
                newArray = hm.get(sortedString);
                newArray.add(words[i]);
                hm.put(sortedString, newArray);
            }
        }

        for(String key: hm.keySet()){
            returnArray.add(hm.get(key));
        }

        return returnArray;
    }

    public static void main(String[] args) {
        ListOfArrays la = new ListOfArrays();

        String array[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(la.whichIsTheList(array));
    }
}
