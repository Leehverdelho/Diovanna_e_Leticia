//Exercicio 002.
//Desenvolvido por Diovanna e Leticia Verdelho.
//Codigo para o usuário adivinhar o número.

import java.util.Scanner;

public class Exe_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		boolean acerto = false;
		System.out.println("Digite um número de 1 a 100: ");
		int num = scanner.nextInt();

		for (i = 1; i <= 7; i++) {

			System.out.println("Adivinhe o número de 1 a 100: ");
			int num1 = scanner.nextInt();

			if (num1 > num) {
				System.out.println("O número digitado é maior que o número escolhido. ");
			}

			else if (num1 < num) {
				System.out.println("O número digitado é menor que o número escolhido.");
			}

			else if (num1 == num) {
				acerto = true;
				break;
			}
		}
		if(acerto) {
			System.out.println("Você acertou!!!!");
		}else {
			System.out.println("Você errou! Acabaram suas tentativas!");
		}

	}

}
