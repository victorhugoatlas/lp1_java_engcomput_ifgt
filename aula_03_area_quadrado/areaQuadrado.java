import java.util.Scanner;

public class areaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado em cm: ");
        double tamanho = scanner.nextDouble();

        double area = tamanho * tamanho;

        System.out.printf("A Área do Quadrado é : %.2f cm²\n", area);

        scanner.close();
    }
}