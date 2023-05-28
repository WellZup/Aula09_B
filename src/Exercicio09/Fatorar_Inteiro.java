package Exercicio09;

import java.util.Scanner;

public class Fatorar_Inteiro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);



        int fatorar = 1;
        int numero;
        System.out.println("Digite um número inteiro: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
                fatorar *= i;
            System.out.println(i);
            }


            System.out.println("O fatoral de  é: " + fatorar);
        }


    }



