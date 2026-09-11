import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um NÚMERO INTEIRO: ");
        int numero = scanner.nextInt();

        System.out.print("Divisores: ");

        for (int i = numero; i >=1; i--) {
            if (numero % i == 0) {
                if (i == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ",");
                }
            }
        }
        System.out.println();
        scanner.close();
    }
}