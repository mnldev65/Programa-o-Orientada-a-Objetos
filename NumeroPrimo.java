/*Peça ao usuário um número e diga se ele é primo. Obs: Um número 
primo tem apenas dois divisores (1 e ele mesmo).*/

import java.util.Scanner;
public class NumeroPrimo{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Vamos descobrir se o número escolhido é primo ou não!");

        System.out.println("Digite um número: ");
        int num = ler.nextInt();

        if (num / num == 1 && num / 1 == num) {
            System.out.printf("O número %d é primo\n", num);
            System.out.println("Explicação: O número escolhido tem apenas dois divisores(1 e ele mesmo)");
            System.out.printf("Logo, os divisores de %d são 1 e %d", num, num);
        }
        else{
            System.out.printf("O número %d não é primo", num);
        }
    }
}