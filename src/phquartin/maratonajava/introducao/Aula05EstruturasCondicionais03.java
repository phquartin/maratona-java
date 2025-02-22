package phquartin.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Exercicio com o objetivo de calcular o Imposto de Renda de uma pessoa na Holanda
        Scanner sc = new Scanner(System.in);
        double salario;
        double taxa;

        System.out.println("Digite seu salario ");
        salario = sc.nextDouble();

        if (salario < 0){
            System.out.println("Salario negativo!");
            System.out.println("Digite seu salario ");
            salario = sc.nextDouble();
        }

        if (salario <= 34712){
            taxa = 9.7;
        }
        else if (salario <= 68507){
            taxa = 37.35;
        }
        else{
            taxa = 49.50;
        }
        System.out.println("Taxa: " + taxa + "% | Salario: €" + salario + " | Total a pagar: €" + salario * (taxa / 100));
    }
}
