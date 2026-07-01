package again;

public class PalindromoInt {
    public boolean isPalindrome(int num){
        int newNum =0, aux = num;
        
        while(num!=0){
            newNum = (newNum * 10) + (num % 10);
            num = num / 10;
        }

        return aux == newNum;
    }

    public static void main(String[] args) {
        PalindromoInt p = new PalindromoInt();
        System.out.println(p.isPalindrome(120));
    }
    
}
