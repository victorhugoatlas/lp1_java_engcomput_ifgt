import java.util.Scanner;

public class AlertaCaldeira {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Duguta a temperatura em °C: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Digite a pressão em atm: ");
        double pressao = scanner.nextDouble();

        boolean dispararAlerta = temperatura > 120.0 && pressao > 5.0;
        System.out.print("Disparar Alerta!: " + dispararAlerta);

        scanner.close();
    }
}