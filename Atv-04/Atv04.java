//  Escreva um programa em Java para ler as notas da primeira e segunda avaliações de um
//aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi
//ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever
//também a média calculada

import java.util.Scanner;
public class Atv04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota1, nota2, media;
        char verif;

        do{
            System.out.print("Digite a nota 1: ");
            nota1 = entrada.nextInt();
            System.out.print("Digite a nota 2: ");
            nota2 = entrada.nextInt();
            media = (nota1 + nota2) / 2;
            if(media >= 6){
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            System.out.print("Deseja calcular outra nota? ");
            verif = entrada.next().toUpperCase().charAt(0);

            if(verif != 'S'){
                System.out.println("Fim do programa!");
            }
        } while (verif == 'S');
    }
}
