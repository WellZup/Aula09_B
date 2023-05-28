package Exercicio06;

import java.util.Scanner;

public class Somar_Impares {
    public static void main(String[] args) {


    Scanner entrada = new Scanner(System.in);
//    System.out.print("Digite quantos números você irá utilizar para calular a sua soma: ");
//    int num = entrada.nextInt();
//    double soma = 0;
//        for (int i = 1; i <= num; i++) {
//        System.out.print("Digite o  " + i + " ° numero: ");
//        double numero = entrada.nextDouble();
//
//        if (numero>0){
//            soma += numero;
//        }else {
//            System.out.println("Valor incorreto!");
//            System.exit(0);
//        }
//
//    }
//        System.out.println("A soma dos números são: " + soma);
//
//        int soma=0;
//        int i = 0;
//        int numeros;
//
//        System.out.print("Digite os números para verificar quais são maiores e menores  \n" + i + " :");
//        numeros = entrada.nextInt();
//
//        while(i<=200){
//            soma =soma +i;
//            i+=2;
//        }
//        System.out.println(soma);


                System.out.print("Digite o valor inicial do intervalo: ");
                int inicio = entrada.nextInt();

                System.out.print("Digite o valor final do intervalo: ");
                int fim = entrada.nextInt();

                if (inicio > fim) {
                    System.out.println("Intervalo de valores inválido");
                } else {
                    int soma = 0;

                    for (int i = inicio; i <= fim; i++) {
                        if (i % 2 != 0) { // verifica se o número é ímpar
                            soma += i;
                        }
                    }

                    System.out.println("A soma dos números ímpares no intervalo é: " + soma);
                }
            }
        }



