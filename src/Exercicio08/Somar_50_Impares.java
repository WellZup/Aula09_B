package Exercicio08;
public class Somar_50_Impares {
    public static void main(String[] args) {

        int soma = 0;
        int x = 0;
        int impares = 50;
        int numero = 1;

        while (x < impares) {
            if (numero % 2 != 0) { // verifica se o número é ímpar
               soma += numero;
               x++;

//                System.out.println(numero);

            }
            numero++;
        }

               System.out.println(soma);
    }
}

