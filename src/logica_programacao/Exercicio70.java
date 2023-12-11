package logica_programacao;

import java.util.Scanner;

public class Exercicio70 {
    public static void main (String[]args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        System.out.println("Tabuada do número " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        leitor.close();
    }
}
