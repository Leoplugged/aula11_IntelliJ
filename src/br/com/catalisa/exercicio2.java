package br.com.catalisa;
import java.util.Scanner;
import  java.text.*;

public class exercicio2 {
    //Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        float valor = leitor.nextFloat();
        DecimalFormat formata = new DecimalFormat();
        formata.setMaximumFractionDigits(2);

        System.out.println("Salário reajustado do funcionário é: R$ "+formata.format((valor*107)/100));
        System.exit(0);
    }
}
