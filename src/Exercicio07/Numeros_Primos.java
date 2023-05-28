package Exercicio07;

import java.util.Scanner;

public class Numeros_Primos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        boolean numeroPrimo;
        if (numero <= 1) {
            numeroPrimo = false;
        } else if (numero == 2 || numero == 3) {
            numeroPrimo = true;
        } else if (numero % 2 == 0 || numero % 3 == 0) {
            numeroPrimo = false;
        } else {
            numeroPrimo = true;
            for (int i = 5; i < Math.sqrt(numero); i += 6) {
                if (numero % i == 0 || numero % (i + 2) == 0) {
                    numeroPrimo = false;
                    break; // já sei que não é primo, interrompe o for
                }
            }
        }
        if (numeroPrimo) {
            System.out.println("O número informado é primo!!!");
        } else {
            System.out.println("O número informado NAO é primo.");
        }
    }

}
