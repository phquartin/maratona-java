package phquartin.maratonajava.introducao;

import java.util.Scanner;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Exercicios ChatGPT
        //        1. Fácil
        //
        //        Crie uma matriz 3x3 de números inteiros e preencha-a com valores de 1 a 9. Em seguida, exiba a matriz no formato de uma grade.
        //
        //                Exemplo de saída:
        //
        //        1  2  3
        //        4  5  6
        //        7  8  9

        int[][] matriz1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] linha : matriz1) {
            for (int num : linha) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
//        2. Médio 1
//
//        Crie uma matriz 4x4 e preencha-a com números aleatórios entre 1 e 100. Depois, encontre e exiba o maior e o menor valor presente na matriz.

        System.out.println("-----------------------------------------");
        int[][] matriz2 = new int[][]{{10, 23, 90, 3}, {1, 2, 92, 12}, {43, 87, 23, 13}, {8, 76, 67, 48}};
        int maiorNum = 0;
        int menorNum = 101;
        for (int[] linha : matriz2) {
            for (int num : linha) {
                if (num > maiorNum) {
                    maiorNum = num;
                } else if (num < menorNum) {
                    menorNum = num;
                }
            }
        }
        System.out.println("Maior numero: " + maiorNum + "\nMenor numero: " + menorNum);
    }
}