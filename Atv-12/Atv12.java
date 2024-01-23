//Desenvolva um programa em Java que receba o preço de um produto e seu código de
//origem e mostre o preço do produto junto de sua procedência, o valor calculado do frete e o
//valor final a ser pago pelo produto, conforme tabela a seguir:

import java.util.Scanner;
public class Atv12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String regiao;
        int codigo;
        float preco, frete, valorTotal;

        do {
            System.out.print("Digite o código do produto: ");
            codigo = entrada.nextInt();
            System.out.print("Digite o preço do produto: ");
            preco = entrada.nextFloat();

            switch (codigo){
                case 1:
                    regiao = "Norte";
                    frete = preco * 0.1f;
                    break;
                case 2:
                case 5:
                case 9:
                    regiao = "Sul";
                    frete = preco * 0.03f;
                    break;
                case 3:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    regiao = "Leste";
                    frete = preco * 0.012f;
                    break;
                case 7:
                case 20:
                    regiao = "Oeste";
                    frete = 0.073f * preco;
                    break;
                default:
                    regiao = "Importado";
                    frete = preco * 0.222f;
                    break;
            }
            valorTotal = frete + preco;
            System.out.printf("Preço do produto: %.2f%nProcedência: %s%nFrete:%.2f%nValor total: %.2f", preco, regiao, frete, valorTotal);
        } while (true);
    }
}

