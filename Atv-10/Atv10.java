// Escreva um programa em Java para ler o salário fixo e o valor das vendas efetuadas pelo
//vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das
//vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu
//salário total.

import java.util.Scanner;
public class Atv10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salarioFixo, valorVendas, salarioTotal, valorVendasExtra;
        char verif;

        do{
            System.out.print("Digite o valor de seu salário: ");
            salarioFixo = entrada.nextFloat();
            System.out.print("Digite o valor das suas vendas: ");
            valorVendas = entrada.nextFloat();
            salarioTotal = salarioFixo + (valorVendas * 1.03f);
            if(valorVendas > 1500){
                valorVendasExtra = valorVendas - 1500;
                salarioTotal = salarioFixo + (valorVendas * 1.03f) + (valorVendasExtra * 1.05f);
            }
            System.out.println("Sálario total: " + salarioTotal);
        } while (true);
    }
}

