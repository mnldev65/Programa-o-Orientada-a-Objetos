/*Crie uma função que vai ler um número e dizer se é positivo, 
negativo ou zero.*/
import java.util.Scanner;
public class ler_numero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Iremos descobrir se seu número é positivo, negativo ou neutro!\n");

        System.out.println("Escolha um número: ");
        float num = ler.nextFloat();

        if (num >= 1) {
            System.out.printf("O número %.2f é positivo", num);
        }
        else if (num <= -1) {
            System.out.printf("O número %.2f é negativo", num);
        }
        else{
            System.out.printf("O número escolhido é %.2f , logo ele é neutro", num);
        }
    }
}
