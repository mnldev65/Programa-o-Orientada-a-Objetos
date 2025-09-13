/*Leia a idade de uma pessoa e diga se ela pode votar (idade ≥ 16).*/
import java.util.Scanner;
public class Votar{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Vamos ver se voçê pode votar!");  

        System.out.print("Digite a sua idade: ");
        int idade = ler.nextInt();

        if (idade >= 16) {
            System.out.printf("Voçê pode votar, pois possue %d anos", idade);
        }
        else{
            System.out.println("Infelizmente voçê não pode votar");
        }
    }
}