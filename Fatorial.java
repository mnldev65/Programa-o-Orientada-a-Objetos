/* Faça uma função para calcular n! para qualquer n >= 0.*/
import java.util.Scanner;
public class Fatorial{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Vamos descobrir o fatorial do número a sua escolha!");

        System.out.println("Digite um número: ");
        int num = read.nextInt();

        if (num >= 0) {
            int resultado = 1;
            for (int i = 1; i <= num; i++) {
                resultado*=i;
            }
            System.out.printf("O resultado do fatorial de %d é igual a %d", num, resultado);
        }
        else{
            System.out.println("Dado invalido!");
        }
    }
}