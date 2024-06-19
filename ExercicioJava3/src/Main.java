import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(10);
        int tentativas = 1;
        System.out.println("Escreva um número de 1 a 10 e tente adivinhar em 5 tentativas: ");

        while(true){
            int chute = Scanner.nextInt();
            if (chute > numeroSecreto){
                System.out.println("O número é menor do que " + chute);
            } else if (chute < numeroSecreto){
                System.out.println("O número é maior do que " + chute);
            } else{
                System.out.println("O número é " + chute + "! Você descobriu com " + tentativas);
                break;
            }
            tentativas++;
        }
        if (tentativas > 5){
            System.out.println("Você perdeu, mas pelo menos descobriu...");
        } else {
            System.out.println("Parabéns, você ganhou!");
        }
    }
}