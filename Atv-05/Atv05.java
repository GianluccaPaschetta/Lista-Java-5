//Escreva um programa em Java para ler o ano atual e o ano de nascimento de uma pessoa.
//Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário
//considerar o mês em que a pessoa nasceu)

import java.util.Scanner;
import java.time.LocalDate;
public class Atv05 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int anoAtual = LocalDate.now().getYear();
        char verif;

        do {
            System.out.print("Digite o ano de seu nascimento: ");
            int anoNasc = entrada.nextInt();
            int idade = anoAtual - anoNasc;
            System.out.printf((idade >= 16) ? "%d, já pode votar" : "%d, não pode votar", idade);
            System.out.print("\nDeseja fazer novamente? ");
            verif = entrada.next().toUpperCase().charAt(0);

            if(verif != 'S'){
                System.out.println("Fim do programa!");
            }
        } while (verif == 'S');
    }
}
