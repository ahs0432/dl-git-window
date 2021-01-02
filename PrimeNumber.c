#include <stdio.h>

void main(){
    int num = 0;
    short isPrime = 1;

    scanf("%d", &num);

    for(int k=2; k<num; k++){
        if(num%k==0){
            isPrime = 0;
            break;
        }
    }

    if(isPrime == 1){
        printf("%d is prime number", num);
    } else {
        printf("%d is not prime number", num);
    }
}
