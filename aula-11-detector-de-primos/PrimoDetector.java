import java.util.Scanner;

public class PrimoDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro que seja maior que 1: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("Número inválido! O número deve ser maior que 1.");
        } else {
            boolean primo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }
        scanner.close();
    }
}