package unidade01;

import java.util.*;

class SomarDoisNumeros {
	
	public static void main(String[] args) {
		//Entrada de Dados.
		Scanner input = new Scanner(System.in);
		
		int num1,num2,soma;
		
		System.out.println("Digite um numero:");
		num1 = input.nextInt();
		
		System.out.println("Digite outro numero:");
		num2 = input.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("Soma : " + soma);
		
		//fechamento do objeto input
		input.close();
		
	
	}
	
}
