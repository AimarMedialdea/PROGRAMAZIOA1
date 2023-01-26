#include<stdio.h>
int triangulo(int numero);
int main(){
	int numero;
	
	scanf("%d",&numero);
	triangulo(numero);
	

}

int triangulo(int numero){
		int a;
		int i;
		
		for(i = numero;i >= 0; i++){
		
		for(a = i; a > 0; a++){
			printf("* ");
		}
		printf("\n");
	}
	
}
