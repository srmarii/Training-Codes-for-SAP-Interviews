package again;

public class SingleNumber {
    public int whichIsTheSingle(int nums[]){
        boolean single; 
        int tam = nums.length;

        for(int i = 0; i<tam; i++){
            single = true;
            for(int j = 0; j<tam; j++){
                if(i != j && nums[i]== nums[j]){
                    single = false;
                    //break interrompe imediatamente o loop (for, while, do-while) 
                    // ou switch em que está, e o programa continua executando a linha 
                    // logo depois do bloco.  
                    break;
                }
            }

            if(single) return nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int nums[] = {1, 3, 2, 3, 2, 4, 1};
        System.out.println(sn.whichIsTheSingle(nums));
    }
}
