/*Faça um programa em Java que leia dois números e exiba o maior 
deles.*/

import java.util.Scanner;
public class Maior_numero{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Vamos descobrir qual é o maior número entre os dois números que voçê escolher!");

        System.out.println("\nDigite um número: ");
        float num1 = ler.nextFloat();

        System.out.println("Digite outro número: ");
        float num2 = ler.nextFloat();

        if (num1 > num2) {
            System.out.printf("O maior número é o %.2f", num1);
        }
        else if (num2 > num1){
            System.out.printf("O maior número é o %.2f", num2);
        }
        else{
            System.out.println("Ambos números são iguais");
        }
    }
}