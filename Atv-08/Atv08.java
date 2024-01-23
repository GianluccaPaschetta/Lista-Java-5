//Escreva um programa em Java para ler a hora de início e a hora de fim de um jogo de
//Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em
//horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode
//iniciar em um dia e terminar no dia seguinte

import java.util.Scanner;
public class Atv08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inicio, fim, total, aux;

        System.out.print("Digite a hora de início do jogo: ");
        inicio = entrada.nextInt();
        System.out.print("Digite a hora do fim do jogo: ");
        fim = entrada.nextInt();

        if(inicio > fim){
            aux = inicio;
            inicio = fim;
            fim = aux;
        }
        total = fim - inicio;
        if(total > 24){
            System.out.println("O tempo máximo de jogo é de 24 horas");
            System.exit(0);
        }
        System.out.printf("O jogo durou %d horas", total);
    }
}

