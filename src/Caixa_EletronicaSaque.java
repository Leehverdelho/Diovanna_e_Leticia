//Exercicio_001.
//Desenvolvido pela dupla Diovanna e Leticia Verdelho.
//O Programa realiza o calculo do valor que você deseja sacar e exiba a quantidade de notas necesarias para chegar nesse valor.
import java.util.Scanner;

public class Caixa_EletronicaSaque {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("------------------------");
		System.out.println("----Caixa Eletronico----");
		System.out.println("------------------------");
		
		System.out.print("Digite o Valor que você dejesa Sacar: ");
		int saque = scanner.nextInt();
		
		int notas;
		
		int nota_100 = 100;
		int nota_50 = 50;
		int nota_20 = 20;
		int nota_10 = 10;
		int nota_5 = 5;
		int nota_2 = 2;
		
		if (nota_100 >= nota_100) {
			nota_100 = saque/100;
			saque = saque % 100;
			if (nota_100 != 0) {
				System.out.println(nota_100 + " notas de R$ 100,00");
			}
		if (nota_50 >= nota_50) {
			nota_50 = saque/50;
			saque = saque % 50;
			if (nota_50 != 0) {
				System.out.println(nota_50+ " notas de R$ 50,00");
			}
		}
		if (nota_20 >= nota_20) {
			nota_20 = saque/20;
			saque = saque % 20;
			if (nota_20 != 0) {
				System.out.println(nota_20+ " notas de R$ 20,00");
			}
		}
		if (nota_10 >= nota_10) {
			nota_10 = saque/10;
			saque = saque % 10;
			if (nota_10 != 0) {
				System.out.println(nota_10+ " notas de R$ 10,00");
			}
		}
		if (nota_2 <= nota_2) {
			nota_2 = saque/2;
			saque = saque % 2;
			if (nota_2 != 0) {
				System.out.println(nota_2+ " notas de R$ 2,00");
			}
		}
		if (nota_5 <= nota_5) {
			nota_5 = saque/5;
			saque = saque % 5;
			if (nota_5 != 0) {
				System.out.println(nota_5+ " notas de R$ 5,00");
			}
		}
				
			
			
			
		}
		
		scanner.close();
		
	}
}
