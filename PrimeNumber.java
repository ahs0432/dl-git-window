import java.util.Scanner;

public class PrimeNumber {
    public  static  void main(String[] args) {
        Scanner scv = new Scanner(System.in);
        int n = scv.nextInt();

        int count = 0;

        for(int k = 2; k<n; k++){
            if(n%k==0) { 
                count ++;
            }
        }

        if(count == 0){
            System.out.println(n + " is prime number!");
        } else {
            System.out.println(n + " is not prime number!");
        }
    }
}
