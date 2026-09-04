package study;

/*
CountDivisors

Dado um número inteiro, retorne quantos divisores ele tem.
Input:  12  → Output: 6   (1, 2, 3, 4, 6, 12)
Input:  7   → Output: 2   (1, 7)
Input:  1   → Output: 1   (1)
*/
public class Divisors {
    public int countDivisors(int number){
        int divisors = 0;

        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                divisors++;
            }
        }

        return divisors;
    }

    public static void main(String[] args) {
        Divisors d = new Divisors();
        System.out.println(d.countDivisors(7));
    }
}
