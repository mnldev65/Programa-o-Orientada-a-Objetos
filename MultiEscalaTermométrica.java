/*Escreva um programa que, com base em uma temperatura em 
graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), 
Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; 
K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67*/
import java.util.Scanner;
public class MultiEscalaTermométrica{
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);

        System.out.println("Convertor de temperatura de celsius para as seguintes temperaturas abaixo: ");
        System.out.println("Digite:(1) para Kelvin,(2) para Réaumur,(3) para Rankine e (4) para Fahrenheit");
        int opcao = temp.nextInt();
        
        if (opcao == 1){
            System.out.println("Digite a temperatura em celsius: ");
            double C = temp.nextFloat();
            double K = C + 273.15;
            System.out.printf("Sua temperatura em kelvin é: %.2f", K);
        } 
        
        else if (opcao == 2){
            System.out.println("Digite a temperatura em celsius: ");
            double C = temp.nextFloat();
            double Re = C * 0.8;
            System.out.printf("Sua temperatura em Réaumur é: %.2f", Re);
        } 
        
        else if (opcao == 3){        
            System.out.println("Digite a temperatura em celsius: ");
            double C = temp.nextFloat();
            double Ra = (C * 1.8) + 32 + 459.67;
            System.out.printf("Sua temperatura em Rankine é: %.2f", Ra);
        } 
        
        else{
            System.out.println("Digite a temperatura em celsius: ");
            double C = temp.nextFloat();
            double F = (C * 1.8) + 32;
            System.out.printf("Sua temperatura em Fahrenheit é: %.2f", F);
        }
    }
}