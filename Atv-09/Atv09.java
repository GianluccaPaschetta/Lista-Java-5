// A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar
//mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo
//de 50%. Escreva um programa em Java que leia o número de horas trabalhadas em um mês, o
//salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas
//extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).



import java.util.Scanner;
public class Atv09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horaMes, horaExtra;
        float salarioHora, salarioExtra, salarioTotal;
        char verif;

        do{
            System.out.print("Digite o total de horas trabalhadas no mês: ");
            horaMes = entrada.nextInt();
            System.out.print("Digite quanto você por hora: ");
            salarioHora = entrada.nextInt();
            salarioTotal = salarioHora * horaMes;

            if(horaMes > 40){
                horaExtra = horaMes - 40;
                salarioExtra = (salarioHora * 1.5f) * horaExtra;
                salarioTotal = (salarioHora * 40) + salarioExtra;
            }
            System.out.println(salarioTotal);

            System.out.print("Deseja calcular novamente? ");
            verif = entrada.next().toUpperCase().charAt(0);
        } while (verif == 'S');
    }
}
