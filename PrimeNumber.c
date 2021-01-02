#include <stdio.h>

void main(){
    int num = 0;
    bool isPrime = true;

    scanf("%d", &num)

    for(int k=2; k<num; k++){
        if(num%k==0){
            isPrime = false;
            break;
        }
    }

    if(isPrime){
        printf("%d is prime number", num);
    } else {
        printf("%d is not prime number", num);
    }
}