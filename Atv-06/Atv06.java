//Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
//iguais) e escrever o maior deles

import java.util.Scanner;
public class Atv06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        char verif;
        do {
            System.out.print("Digite um número: ");
            num1 = entrada.nextInt();
            System.out.print("Digite outro número: ");
            num2 = entrada.nextInt();
            if(num1 == num2){
                System.out.println("Digite dois números diferentes");
            }
            System.out.printf("Os número digitados foram: %d e %d%n", num1, num2);
            if (num1 > num2){
                System.out.printf("E o maior número digitado foi o 1º: %d%n", num1);
            } else if(num2 > num1){
                System.out.printf("E o maior número digitado foi o 2º: %d%n", num2);
            }
            System.out.print("Deseja testar novamente? ");
            verif = entrada.next().toUpperCase().charAt(0);
        } while (verif == 'S');
    }
}

