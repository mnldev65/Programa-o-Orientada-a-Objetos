/*Crie uma função que leia dois números e retorne a média entre 
eles. Logo após, exibir na tela o resultado dela.  */
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos descobrir a média entre dois números!");

        System.out.println("Insira um número: ");
        float num1 = scan.nextFloat();

        System.out.println("Insira outro número: ");
        float num2 = scan.nextFloat();

        float media = (num1 + num2)/2;
        System.out.printf("A média aritimética dos números escolhidos foi %.2f", media);
        System.out.println("\nExplicação: somamos os dois números (" + num1 + " + " + num2 + ") = " + (num1 + num2) +", e depois dividimos o resultado por 2. Portanto, (" + (num1 + num2) + " / 2) = " + media);
    }
}
