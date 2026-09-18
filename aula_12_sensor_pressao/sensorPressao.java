import java.util.Scanner;

public class sensorPressao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sucesso = false;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o valor de offset (entre 1.0 e 5.0): ");
            double offset = scanner.nextDouble();

            if (offset >= 1.0 && offset <= 5.0) {
                System.out.println("Calibração confirmada!");
                sucesso = true;
                break;
            } else {
                System.out.println("Valor inválido.");
            }
        }

        if (!sucesso) {
            System.out.println("Alerta: Sistema bloqueado! Número de tentativas esgotado.");
        }

        scanner.close();
    }
}