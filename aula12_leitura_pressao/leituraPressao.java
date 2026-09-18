import java.util.Scanner;

public class leituraPressao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a leitura " + i + " (PSI): ");
            double leitura = scanner.nextDouble();
            soma += leitura;
        }
        double media = soma / 5;
        System.out.println("--- RELATÓRIO FINAL ---");
        System.out.println("Soma total: " + soma);
        System.out.println("Média das leituras: " + media);
        scanner.close();
    }
}