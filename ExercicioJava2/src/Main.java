public class Main {
    public static void main(String[] args) {
        double nota1 = 5.9;
        double nota2 = 4.0;
        double resultado = nota1 + nota2;
        int notaInteira = (int) resultado;
        String palavrinhaMagica = String.format("Sua nota foi: %f", resultado);
        System.out.println(palavrinhaMagica);

        char letra = 'R';
        String palavra = "Eu gosto da letra ";
        System.out.println(palavra + letra);

        double precoProduto = 19.99;
        int quantidade = 5;
        int total = (int) precoProduto * quantidade;
        System.out.println("O preço vai ser: " + total);
        double precoDolar = 4.94;
        double valorEmDolar = (precoProduto * quantidade) * precoDolar;
        System.out.println("Em dólares, o preço vai ser: " + valorEmDolar);
    }
}