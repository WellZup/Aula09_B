package Exercicio03;

import java.util.Scanner;

public class Maior_Menor {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int  maiorValor = 0,menorValor = 0,numeros;



        for(int i = 1; i <= 10; i++){

        System.out.print("Digite os números para verificar quais são maiores e menores  \n" + i + " :");
        numeros = entrada.nextInt();
            if (i == 1) {
                menorValor = numeros;
                maiorValor = numeros;
            }  else if (numeros < menorValor) {
                {
                  menorValor = numeros;

                }if (numeros > maiorValor){
                   maiorValor = numeros;
                }
            }

    }

        System.out.println("O menor valor digitado é: " + menorValor);
        System.out.println("O maior valor digitado é: " + maiorValor);
   }
}


