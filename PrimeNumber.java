import java.util.Scanner;

public class PrimeNumber {
    public  static  void main(String[] args) {
        Scanner scv = new Scanner(System.in);
        int n = scv.nextInt();

        //int count = 0;
        boolean isPrime = true;

        for(int k = 2; k<n; k++){
            if(n%k==0) {
                // count++; // count = count + 1;
                isPrime = false;
                break;
            }
        }

        // if(count == 0) {
        if(isPrime){
            System.out.println(n + " is prime number!");
        } else {
            System.out.println(n + " is not prime number!");
        }
    }
}