package again;

public class Maior {
    public int whichIsTheBigger(int num[]){
        int maior = num[0], tam = num.length;

        for(int i = 0; i<tam; i++){
            if(num[i]>maior){
                maior=num[i];
            }
        }

        return maior;
    }

    public static void main(String[] args){

    Maior m = new Maior();
    int nums[] = {1,2,35,7,3,34,45,4};

    System.out.println(m.whichIsTheBigger(nums));
}
}
