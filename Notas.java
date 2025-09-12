
import java.util.Scanner;

/*Calcule a média de 3 notas e diga se o aluno foi aprovado ou 
reprovado.*/
public class Notas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int quantidade = 3;
        float soma = 0;
        System.out.println("Vamos ver se voçê foi aprovado ou reprovado!");

        int [] num = new int [quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Insira sua nota: ");
            float n = ler.nextFloat();
            soma+=n;
        }

        float media = (soma)/quantidade;
        System.out.printf("O resultado da média foi %.2f", media);

        if (media >= 7) {
            System.out.println("Parabéns voçê foi aprovado!");
        }
        else{
            System.out.println("Infelizmente voçê foi reprovado!");
        }
    }
}
