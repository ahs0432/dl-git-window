import java.util.Scanner;

public class PrimeNumber {
    public  static  void main(String[] args) {
        Scanner scv = new Scanner(System.in);
        int n = scv.nextInt();

        // 1과 자기 자신 외에는 나누어 떨어지지 않는 수, 소수.
        int count = 0;

        for(int k =1; k<=n; k++){
            if(n%k==0) { // 1부터 1씩 증가하며 입력 받을 수가 나누어 떨어지는 횟수를 Count
                count ++;
            }
        }

        if(count == 2){
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n + " is not prime number");
        }
    }
}
