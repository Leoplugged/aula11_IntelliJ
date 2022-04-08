package br.com.catalisa;
import java.util.Scanner;

public class exercicio3 {
    //Crie um algoritmo que leia dois valores (x e y) representando um intervalo. Em seguida, leia um novo valor (z) e verifique se z pertence ao intervalo [x, y]
    public static void main(String[] args) {

        int[] valor = new int[2];//valores
        int i = 0;
        String[] mensagem = new String[i];//mensagens

        /*logs
        mensagem[0] = ; //mensagem inicial e do primeiro valorv(x)
        mensagem[1] = ;//mensagem do segundo valor (y)
        mensagem[2] = ;//mensagem de aviso de que o valor inicial é maior que final.
        mensagem[3] = ;//mensagem do terceiro valor (z);
        mensagem[4] = "Fica dentro!";//;
        mensagem[5] = "Fica fora!";//;
*/
        Scanner leitor = new Scanner(System.in);

        System.out.println(":: Checagem de valores dentro de um intervalo ::\n\nDigite um valor que represente o início do intervalo desejado:");
        valor[0] = leitor.nextInt(); //representa valor x
        System.out.println("Digite outro valor que represente o final do intervalo:");
        valor[1] = leitor.nextInt(); //representa valor y
        for(i = 0; i < 1000; i++ ){//checa se o último valor é maior que o primeiro
            if(valor[0]>valor[1]) {
                System.out.println("O valor final é menor que o valor inicial. Por favor, defina um valor menor que "+valor[0]+":");
                valor[1] = leitor.nextInt();//muda valor y
            }else{
                System.out.println("Agora, para saber se o valor está dentro do intervalo recém-definido, digite um valor:");
                valor[2] = leitor.nextInt();//representa valor z
                if(valor[2] < valor[1] && valor[2]> valor[0]){
                    System.out.println("O valor "+valor[2]+"fica entre "+valor[0]+" e "+valor[1]+".");
                }else{
                    System.out.println("O valor "+valor[2]+"não fica entre "+valor[0]+" e "+valor[1]+".");
                }
            }
        }
    }
}
