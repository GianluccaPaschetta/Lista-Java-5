// Escreva um programa em Java para ler um valor e escrever se é positivo ou negativo.
// (Considere o valor zero como positivo).

import java.util.Scanner;
public class Atv2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char verif;
		do{
			System.out.print("Digite um número: ");
			int num = entrada.nextInt();

			System.out.println((num % 2 == 0) ? "O número é positivo" : "O número é negativo");
			System.out.print("Deseja tentar novamente? ");
			verif = entrada.next().toUpperCase().charAt(0);
		} while (verif == 'S');

	}
}

