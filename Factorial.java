package kr.ac.daelim;

import java.util.Scanner;

public class Factorial {
    public  static void main(String[] args){
        Scanner scv = new Scanner(System.in);
        int num = scv.nextInt();
        int sum = 1;

        for(int i = 1; i <  num+1; i++){
            sum *= i;
        }

        System.out.println(sum);
    }
}
