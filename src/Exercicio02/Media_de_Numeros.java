package Exercicio02;
import java.util.Scanner;
public class Media_de_Numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeros, quantidade, media;
        int soma = 0;
        System.out.println("Digite a quantidade de números para vermos a média entre eles: \n");
        quantidade = entrada.nextInt();

        for(int i = 1; i<= quantidade; i++){

        System.out.print("Agora digite os números de acordo com a quantidade que desejou  \n" + i + " :");
        numeros = entrada.nextInt();

        soma += numeros;

        }

        media = soma / quantidade;
        System.out.println("A média dos números digitados é: " + media);

    }
}
