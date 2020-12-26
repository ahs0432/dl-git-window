#include <stdio.h>

void main(){
	int num = 0;

	while (1) {
		printf("소수를 확인할 정수를 입력해주세요.: ");
		
		if(scanf("%d", &num)==0){
			printf("정수만 입력이 가능합니다!\n");
		}else if(num<=0){
			printf("1 이상의 수를 입력해주세요!\n");
		}else{
			break;
		}

		getchar();
	}
	
	for (int i=2;i <= num/2; i++){
		if (num%i==0){
			printf("%d is not prime number!\n", num);
			return;
		}
	}
	
	printf("%d is prime number!\n", num);
	return;
}
