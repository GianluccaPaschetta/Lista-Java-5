//Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
//iguais) e escrevê-los em ordem crescente

import java.util.Scanner;
public class Atv07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, aux;
        char verif;

        do {
            System.out.print("Digite um número: ");
            num1 = entrada.nextInt();
            System.out.print("Digite outro número: ");
            num2 = entrada.nextInt();
            while (num1 == num2){
                System.out.println("Informe números diferentes");
                System.out.print("Digite um número: ");
                num1 = entrada.nextInt();
                System.out.print("Digite outro número: ");
                num2 = entrada.nextInt();
            }
            if(num1 > num2){
                aux = num1;
                num1 = num2;
                num2 = aux;
            }
            System.out.printf("Os números em ordem crescente são: %d %d%n", num1, num2);
            System.out.print("Deseja testar novamente? ");
            verif = entrada.next().toUpperCase().charAt(0);
            if(verif != 'S'){
                System.out.println("Fim do programa!");
            }
        } while (verif == 'S');
    }
}

