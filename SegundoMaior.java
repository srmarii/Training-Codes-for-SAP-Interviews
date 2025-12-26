public class SegundoMaior {
    public int segundoMaiorNum(int[] nums){
        int[] doisMaiores = new int[2];
        int tam = nums.length;

        doisMaiores[0] = nums[0];

        for(int i =0; i<tam; i++){
            if(nums[i] > doisMaiores[0]){
                doisMaiores[1] = doisMaiores[0];
                doisMaiores[0] = nums[i];
            }
        }

        return doisMaiores[1];
    }

    public static void main(String[] args) {
        SegundoMaior sm = new SegundoMaior();
    
        int[] nums = {1, 2, 3, 5, 6, 3, 5, 2, 100, 101};

        System.out.println(sm.segundoMaiorNum(nums));

    }
}
 