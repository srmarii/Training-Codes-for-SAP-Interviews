package study;

import java.util.HashSet;

/*
------ [ ] Intersection of Two Arrays
Dados dois arrays, retorne um array com os elementos que aparecem nos dois.
Input:  [1, 2, 2, 3, 4],  [2, 2, 5, 4]  → Output: [2, 4]  (sem duplicatas no resultado)
*/

public class IntersectionOfTwoArrays {
    public HashSet<Integer> intersection(int array1[], int array2[]){

        HashSet<Integer> hsArray1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(int num: array1){
            hsArray1.add(num);
        }

        for(int num: array2){
            if(hsArray1.contains(num)){
                intersection.add(num);
            }
        }


        return intersection;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays inter = new IntersectionOfTwoArrays();

        int array1[] = {1, 2, 2, 3, 4};
        int array2[] = {2, 2, 5, 4};

        System.out.println(inter.intersection(array1, array2));
    }
    
}
