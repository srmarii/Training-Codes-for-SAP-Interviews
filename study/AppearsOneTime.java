package study;

import java.util.ArrayList;
import java.util.HashMap;

/*
2) 
# ["LAX", "JFK", "ORD", "ATL", "LAX", "SFO", "ORD"]
# Encontrar e printar os que aparecem só uma vez
output= ["JFK", "ATL", "SFO"]
*/
public class AppearsOneTime {
    public ArrayList<String> whichAppearsOneTime(String words[]){

        //key= each word
        //value= frequency
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> array = new ArrayList<>();

        for(String word: words){
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }

        for(String key: hm.keySet()){
            if(hm.get(key) == 1){
                array.add(key);
            }
        }

        return array;
    }

    public static void main(String[] args) {
        AppearsOneTime a1 = new AppearsOneTime();

        String words[] = {"LAX", "JFK", "ORD", "ATL", "LAX", "SFO", "ORD"};

        System.out.println(a1.whichAppearsOneTime(words));
    }
}
