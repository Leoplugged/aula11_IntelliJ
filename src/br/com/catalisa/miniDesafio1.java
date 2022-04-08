package br.com.catalisa;

import java.util.Scanner;
public class miniDesafio1 {

    public static void main(String[] args) {
        // Crie uma calculadora
        System.out.println("Calculadora");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite primeiro número:");
        int x = leitor.nextInt();
        System.out.println("Digite segundo número:");
        int y = leitor.nextInt();

        for (int i = 0; i < 1000; i++) {
            System.out.println("Calculadora\n1. Somar\n2. Subtrair\n3. Multiplicar\n4. Dividir\n5. Finalizar Calculadora");

            int selecao = leitor.nextInt();
            int resultado = 0;

            if (selecao == 1) {
                resultado = x + y;
                //System.out.println(resultado);
            } else if (selecao == 2) {
                resultado = x - y;
                //System.out.println(resultado);
            } else if (selecao == 3) {
                resultado = x * y;
                //System.out.println(resultado);
            } else if (selecao == 4) {
                resultado = x / y;

            } else {
                System.exit(0);
            }
            System.out.println(resultado);
        }
        System.out.println("Calculadora\n1. Somar\n2. Subtrair\n3. Multiplicar\n4. Dividir\n5. Finalizar Calculadora");
    }
}