#include <stdio.h>

void main(){
	int num = 0;
	scanf("%d", &num);
	
	for (int i=2;i <= num/2; i++){
		if (num%i==0){
			printf("%d is not prime number\n", num);
			return;
		}
	}
	
	printf("%d is prime number\n", num);
	return;
}
