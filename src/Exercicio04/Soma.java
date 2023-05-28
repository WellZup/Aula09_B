package Exercicio04;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite quantos números você irá utilizar para calular a sua soma: ");
        int num = ler.nextInt();
        double soma = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print("Digite o  " + i + " ° numero: ");
            double numero = ler.nextDouble();

            if (numero>0){
                soma += numero;
            }else {
                System.out.println("Valor incorreto!");
                System.exit(0);
            }

    }
        System.out.println("A soma dos números são: " + soma);
}
}

