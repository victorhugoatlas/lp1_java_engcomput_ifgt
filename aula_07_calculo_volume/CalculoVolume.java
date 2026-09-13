import java.util.Scanner;

public class CalculoVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura em cm: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite a largura em cm: ");
        double largura = scanner.nextDouble();

        System.out.print(" Digite a profundidade em cm: ");
        double profundidade = scanner.nextDouble();

        double volume = altura * largura * profundidade;

        System.out.printf("Dimensões: %.2f cm x %.2f cm x %.2f cm\n", altura, largura, profundidade);
        System.out.printf("Volume: %.2f cm³\n", volume);

        scanner.close();
    }
}