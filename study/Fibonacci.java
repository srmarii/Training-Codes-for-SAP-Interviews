package study;

public class Fibonacci {
    public void isFibonacciNumber(int n){
        int numberBefore = 0, currentNumber = 1, fibonacciNumber = 1;

        for(int i = 0; i < n; i++){
            System.out.println(fibonacciNumber);
            fibonacciNumber = numberBefore + currentNumber;
            
            numberBefore = currentNumber;
            currentNumber = fibonacciNumber;
        } 
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.isFibonacciNumber(10);
    }


}