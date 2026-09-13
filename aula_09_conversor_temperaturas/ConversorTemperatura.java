import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temp = scanner.nextDouble();

        System.out.print("Qual a unidade de origem (C, F ou K)? ");
        char unidade = scanner.next().toUpperCase().charAt(0);

        System.out.println("\n--- CONVERSÕES ---");

        if (unidade == 'C') {
            double f = (temp * 9 / 5) + 32;
            double k = temp + 273.15;
            System.out.printf("Fahrenheit: %.2f °F\n", f);
            System.out.printf("Kelvin: %.2f K\n", k);
        } else if (unidade == 'F') {
            double c = (temp - 32) * 5 / 9;
            double k = c + 273.15;
            System.out.printf("Celsius: %.2f °C\n", c);
            System.out.printf("Kelvin: %.2f K\n", k);
        } else if (unidade == 'K') {
            double c = temp - 273.15;
            double f = (c * 9 / 5) + 32;
            System.out.printf("Celsius: %.2f °C\n", c);
            System.out.printf("Fahrenheit: %.2f °F\n", f);
        } else {
            System.out.println("Unidade inválida!");
        }
        scanner.close();
    }
}