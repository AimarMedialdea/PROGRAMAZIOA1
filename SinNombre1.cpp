
#include<stdio.h>
int suma(int numero, int numero1);

int main(){
int numero;
int numero2;

printf("pon 2 numeros: ");
scanf("%d",&numero);
scanf("%d",&numero2);

suma(numero, numero2);
printf("%d",suma(numero, numero2));

}


int suma(int numero, int numero1){
	int batuketa = 0;
	batuketa = numero + numero1;
	return batuketa;
}
