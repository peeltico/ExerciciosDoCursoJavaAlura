import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número de sua escolha que não seja 0:");
        double numeroDigitado = leitura.nextDouble();
        while(true){
            if (numeroDigitado == 0){
                System.out.println("O número digitado foi 0, escreva novamente.");
        } else if(numeroDigitado > 0){
                System.out.println("O número é positivo.");
                break;
            } else {
                System.out.println("O número é negativo.");
                break;
            }
        }
        System.out.println("Digite um número:");
        int numeroInteiro = leitura.nextInt();
        System.out.println("Digite outro número:");
        int numeroInteiro2 = leitura.nextInt();

        if(numeroInteiro == numeroInteiro2){
            System.out.println("Os números são iguais.");
        } else{
            System.out.println("Os números são diferentes.");
        }
        if(numeroInteiro > numeroInteiro2){
            System.out.println("O número "+numeroInteiro+" é maior que o número "+numeroInteiro2+"!");
        } else{
            System.out.println("O número "+numeroInteiro2+" é maior que o número "+numeroInteiro+"!");
        }
        System.out.println("Digite um número inteiro para uma tabuada:");
        int numeroEscolhido = leitura.nextInt();

        for(int cont = 1; cont <= 10; cont++)
        {
            int resultado = numeroEscolhido * cont;
            System.out.println(numeroEscolhido + " x " + cont + " " + resultado + "; ");
        }


        System.out.println(
                numeroEscolhido + " x 1 = " + numeroEscolhido + "; " +
                        numeroEscolhido + " x 2 = " + numeroEscolhido * 2 + "; " +
                        numeroEscolhido + " x 3 = " + numeroEscolhido * 3 + "; " +
                        numeroEscolhido + " x 4 = " + numeroEscolhido * 4 + "; " +
                        numeroEscolhido + " x 5 = " + numeroEscolhido * 5 + "; " +
                        numeroEscolhido + " x 6 = " + numeroEscolhido * 6 + "; " +
                        numeroEscolhido + " x 7 = " + numeroEscolhido * 7 + "; " +
                        numeroEscolhido + " x 8 = " + numeroEscolhido * 8 + "; " +
                        numeroEscolhido + " x 9 = " + numeroEscolhido * 9 + "; " +
                        numeroEscolhido + " x 10 = " + numeroEscolhido * 10
        );
        System.out.println("Digite um número:");
        int numero = leitura.nextInt();
        if(numero % 2 == 0){
            System.out.println("O número "+numero+" é par.");
        } else{
            System.out.println("O número "+numero+" é ímpar.");
        }
    }
}