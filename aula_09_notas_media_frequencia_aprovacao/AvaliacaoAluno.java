import java.util.Scanner;

public class AvaliacaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a frequência em %: ");
        double frequencia = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.printf("Média: %.2f\n", media);
        System.out.printf("Frequência: %.2f\n", frequencia);

        if (media < 6) {
            System.out.println("Reprovado por nota");
        }
        else if (frequencia < 75) {
            System.out.println("Reprovado por falta");
        }
        else {
            System.out.println("Parabéns, você foi aprovado!");

            if (media > 9) {
                System.out.println("Parabéns pelo excelente desempenho!");
            }
        }
    scanner.close();
    }
}