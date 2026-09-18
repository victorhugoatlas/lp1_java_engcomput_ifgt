import java.util.Scanner;

public class leituraPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalLeituras = 0;
        double soma = 0;
        double maiorPotencia = Double.NEGATIVE_INFINITY;

        while (true) {
            System.out.print("Digite a potência em dBm (ou -999 para sair): ");
            double potencia = scanner.nextDouble();

            if (potencia == -999) {
                break;
            }

            totalLeituras++;
            soma += potencia;

            if (potencia > maiorPotencia) {
                maiorPotencia = potencia;
            }
        }

        if (totalLeituras > 0) {
            double media = soma / totalLeituras;
            System.out.println("Total de leituras válidas: " + totalLeituras);
            System.out.println("Maior potência: " + maiorPotencia);
            System.out.println("Média das leituras: " + media);
        } else {
            System.out.println("Nenhuma leitura válida foi registrada.");
        }

        scanner.close();
    }
}