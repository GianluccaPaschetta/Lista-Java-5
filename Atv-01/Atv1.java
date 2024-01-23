// Escreva um programa em Java para ler um valor e escrever a mensagem "É MAIOR QUE 10!" se o valor lido for maior que 10,
// caso contrário escrever "NÃO É MAIOR QUE 10!"

import java.util.Scanner;
public class Atv1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char verif;

		do{
			System.out.print("Digite um valor: ");
			int num = entrada.nextInt();
			System.out.println((num > 10) ? "É maior que 10!" : "Não é maior que 10");

			System.out.print("Deseja tentar novamente? ");
			verif = entrada.next().toUpperCase().charAt(0);

		} while (verif == 'S');
		System.out.println("Fim do programa, obrigado!!");
	}
}

