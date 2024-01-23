/* As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
forem compradas pelo menos 12. Escreva um programa em Java que leia o número de maçãs
compradas, calcule e escreva o custo total da compra.. */

import java.util.Scanner;;
public class Atv03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char verif;
		float preco;
		do{
			System.out.print("Quantas maçãs deseja comprar? ");
			int maca = entrada.nextInt();
			if(maca < 12){
				preco = maca * 1.30f;
				System.out.printf("%d maçãs, cada uma por R$1,30, preço total R$%.2f%n", maca, preco);
			} else {
				preco = maca * 1f;
				System.out.printf("%d maçãs, cada uma por R$1,00, preço total R$%.2f%n", maca, preco);
			}
			System.out.print("Deseja comprar mais maçãs? ");
			verif = entrada.next().toUpperCase().charAt(0);
		} while(verif == 'S');
	} 
}

