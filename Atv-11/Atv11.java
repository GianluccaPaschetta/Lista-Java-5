// Desenvolva um programa em Java que receba dois valores numéricos e uma das opções
//que representam uma das operações aritméticas (ler em String e testar como char): ‘+’ , ‘-‘, ‘*’
//e ‘/’. Calcule e mostre a operação efetuada e o seu resultado

import java.util.Scanner;
public class Atv11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        String operadorString;
        char operador;

        do {
            System.out.print("Digite um número: ");
            num1 = entrada.nextInt();
            System.out.print("Digite outro número: ");
            num2 = entrada.nextInt();
            System.out.print("Digite uma operação aritméticas: ‘+’, ‘-‘, ‘*’ e ‘/’");
            operadorString = entrada.next();
            operador = operadorString.charAt(0);

            switch (operador){
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("Digite um operador válido");
                    break;
            }

        } while (true);
    }
}

