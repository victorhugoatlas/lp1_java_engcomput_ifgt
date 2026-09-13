import java.util.Scanner;

public class SeparadorPecas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da peça em gramas (g): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite o comprimento da peça em centímetros (cm): ");
        double comprimento = scanner.nextDouble();

        boolean pecaRejeitada = peso < 150.0 || comprimento > 30.0;
        System.out.println("Peça rejeitada: " + pecaRejeitada);

        scanner.close();
    }
}