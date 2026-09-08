package study;

public class FibonacciAndPrime {
    public void isFibonacciAndPrimeNumber(int n){
        int fibonacciNumber = 1, currentNumber = 1, pastNumber = 0, counter = 0;
        while (counter < n){
            boolean isPrime = true;
            for(int m = 2; m < fibonacciNumber; m++) {
                if(fibonacciNumber % m == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(fibonacciNumber);
                counter++;
            }
            
            fibonacciNumber = currentNumber + pastNumber;
            pastNumber = currentNumber;
            currentNumber = fibonacciNumber;
        }
    }
    

    public static void main(String[] args) {
        FibonacciAndPrime fibonacciAndPrime = new FibonacciAndPrime();
        fibonacciAndPrime.isFibonacciAndPrimeNumber(10);
    }
}
