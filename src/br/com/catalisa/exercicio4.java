package br.com.catalisa;

import java.util.Scanner;

public class exercicio4 {
    //Crie um algoritmo que lê dois números inteiros, x e y, e mostre o resultado da multiplicação de x por y
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float[] valor = new float[1];

        System.out.println(":: Multiplicador de valores ::\nDigite o primeiro valor:");
        valor[0] = leitor.nextFloat();//representa x
        System.out.println("Digite o segundo valor:");
        valor[1] = leitor.nextFloat();//representa y

        System.out.println("O resultado é "+valor[0]*valor[1]+".");
    }
}
