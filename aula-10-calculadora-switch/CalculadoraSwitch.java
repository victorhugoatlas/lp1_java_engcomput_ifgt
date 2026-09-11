import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o operador (+ , - , * , /): ");
        char operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println("Resultado é: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Resultado é: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Resultado é: " + (num1 * num2));
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Divisão por 0 não é possível");          
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                } break;

            default:
                System.out.println("Operação Inválida!");
                break;


        }
        scanner.close();
    }
}