import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("==== Calculadora Seletora =====");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.println("===============================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                if (opcao == 1) {
                    System.out.println("Resultado: " + (num1 + num2));
                } else if (opcao == 2) {
                    System.out.println("Resultado: " + (num1 - num2));
                } else if (opcao == 3) {
                    System.out.println("Resultado: " + (num1 * num2));
                } else if (opcao == 4) {
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                }
            } else if (opcao == 5) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida! Tente de novo!.");
            }
            System.out.println();
        }
        scanner.close();
    }
}