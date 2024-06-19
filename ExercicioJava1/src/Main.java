public class Main {
    public static void main(String[] args){
        double temp = 20;
        double conversao = (temp * 1.8) + 32;
        String mensagemInicial = String.format("A temperatura em celsius é de %f e de fahrenheit é de %f", temp, conversao);
        System.out.println(mensagemInicial);
        int temperaturaEmFahrenheitInteira = (int) conversao;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);
    }

}
