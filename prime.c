#include <stdio.h>

int main(){
	int num, prime = 0;
	scanf("%d", &num);
	
	for (int i=2;i <= num/2; i++){
		if (num%i==0){
			prime=1;
			break;
		}
	}

	if (prime==0){
		printf("%d is prime number\n", num);
	} else {
		printf("%d is not prime number\n", num);
	}

	return 0;
}
