// Desenvolvido por
/*Crie um programa que multiplica todos os numeros impares entre 1 e o
número fornecido pelo usuario*/

import java.util.Scanner;

public class  Exe_4  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= num; i += 2) 
        {
            result *= i;
        }

        System.out.println("A multiplicação dos números ímpares até " + num + " é: " + result);

        sc.close();
    }
}
