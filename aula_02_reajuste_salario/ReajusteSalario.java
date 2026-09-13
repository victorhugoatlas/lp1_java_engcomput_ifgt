import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        double salario = scanner.nextDouble();

        double salarioReajustado = salario;

        if (salario < 2000.0) {
            salarioReajustado = salario + (salario * 0.10);
        }

        System.out.printf("Novo Salário: R$ %.2f\n", salarioReajustado);

        scanner.close();
    }
}