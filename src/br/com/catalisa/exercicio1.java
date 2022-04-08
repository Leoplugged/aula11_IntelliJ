package br.com.catalisa;

import java.util.Scanner;

public class exercicio1 {
    //Crie um algoritmo que leia dois valores (x e y) e informe se eles são iguais
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] valor = new int[2];
        String[] resultado = new String[2];

        resultado[0] = "Os valores são iguais.";
        resultado[1] = "Os valores são diferentes.";

        System.out.println(":: Comparador de valores ::\nDigite o primeiro valor:");
        valor[0] = leitor.nextInt();

        System.out.println("Digite o segundo valor:");
        valor[1] = leitor.nextInt();

        if (valor[0] == valor[1]) {
            System.out.println(resultado[0]);
        } else {
            System.out.println(resultado[1]);
        } leitor.close();
    }
}