import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String opcoes ="""
                    *******************************************************
                                       Opções Viáveis
                    
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    
                    *******************************************************
                    """;
        System.out.println("Qual seu nome?");
        String nome = leitura.nextLine();
        System.out.println("Digite sua idade:");
        int idade = leitura.nextInt();
        double saldo = 2500;
        String informacoes = """
                *******************************************************
                                      Boas-Vindas
                
                                      Informações:
                
                Nome:\s\s\s\s\s\s\s\s\s\s\s\s""" + nome + """
                \nIdade:\s\s\s\s\s\s\s\s\s\s\s""" + idade + """
                \nTipo de conta:   Corrente
                Saldo Inicial:   R$""" + saldo + """
                
                ********************************************************
                """;

        System.out.println(informacoes);
        while(true){
            System.out.println("\nDigite 1 para continuar.\n");
            int numeroDigitado = leitura.nextInt();
            if(numeroDigitado != 1){
                System.out.println("\nComando inválido, tente novamente.\n");
            } else{
                break;
            }
        }
        while(true){
            System.out.println(opcoes);
            System.out.println("\nDigite o número da ação que deseja:\n");
            int numeroDigitado2 = leitura.nextInt();
            if(numeroDigitado2 == 1){
                System.out.println("\nO seu saldo atual é de R$"+saldo+"\n");
            } else if (numeroDigitado2 == 2) {
                System.out.println("\nDigite o quanto você quer depositar:\n");
                double depositar = leitura.nextDouble();
                saldo = saldo + depositar;
                System.out.println("\nO seu novo saldo é R$"+saldo+"!\n");
            } else if(numeroDigitado2 == 3){
                System.out.println("\nDigite o quanto você quer retirar:\n");
                double retirar = leitura.nextDouble();
                saldo = saldo - retirar;
                System.out.println("\nO seu novo saldo é R$"+saldo+"!\n");
            } else if(numeroDigitado2 == 4){
                System.out.println("\nTudo bem, tenha um ótimo dia!\n");
                break;
            } else{
                System.out.println("\nComando inválido, tente novamente.\n");
            }
        }
    }
}