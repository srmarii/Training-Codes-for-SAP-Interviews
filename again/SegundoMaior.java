package again;

public class SegundoMaior {
    public int whichIsTheSecondBigger(int nums[]){
        int biggers[] = new int[2], tam = nums.length;
        
        biggers[0]= nums[0];

        for(int i=0; i<tam; i++){
            if(nums[i] > biggers[0]){
                biggers[1] = biggers[0];
                biggers[0]=nums[i];
            }
        }

        return biggers[1];
    }

    public static void main(String[] args) {
        SegundoMaior sm = new SegundoMaior();
        int nums[] = {1, 2, 4, 5, 7, 9, 2, 3, 77, 87};
        System.out.println(sm.whichIsTheSecondBigger(nums));
    }
}
