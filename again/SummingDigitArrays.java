package again;
// add([7], [4]) should return [1,1] (7 + 4 = 11)
// add([9,9,5], [1,0]) should return [1,0,0,5] (995 + 10 = 1005)

import java.util.Arrays;

// https://gist.github.tools.sap/I860668/1d631abfc7a2645d5e6cd6ffa43a7a5f

public class SummingDigitArrays {
    public int[] summingArrays(int array1[], int array2[]){
        int tam = array1.length, aux = 0, sobeUm = 0, j=tam; 
        int result[] = new int[tam + 1]; 

          for(int i = tam -1; i>=0; i--){
            aux = array1[i] + array2[i] + sobeUm;                                                                                                                             
            sobeUm = 0;                                                                                                                                                       
            if(aux >= 10){                                                                                                                                                    
                sobeUm = aux / 10;                                                                                                                                            
                aux = aux % 10;
            }                                                                                                                                                                 
            result[j] = aux;
            j--;
        }
        result[0] = sobeUm;


        return result;
    }

    public static void main(String[] args) {
        SummingDigitArrays s = new SummingDigitArrays();

        int array1[] = {9, 8, 7}, array2[] = {3, 4};
        System.out.println(Arrays.toString(s.summingArrays(array1, array2)));
    }
}
