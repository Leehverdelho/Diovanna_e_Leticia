//Desenvolvido pelo grupo Diovanna, Leticia, Gustavo.
//Crie um programa que soma todos os números pares entre 1 e 0 número fornecido pelo Usuario.

import java.util.Scanner;
public class Exercicio_003 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);

		
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
	    int soma = 0;
	    
	    			
		for(int i = 2 ; i <= numero ; i ++) {
			
			if( i % 2 == 0 ) {
				soma += i;
			}
			
		}
		 
		System.out.println("A soma de todos os Números os numeros pares entre 1 e " + numero + " é : " + soma);
				
		scanner.close();
	}

}
