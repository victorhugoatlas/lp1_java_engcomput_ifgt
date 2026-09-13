import java.util.Scanner;

public class EmbaladorPecas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de peças produzidas: ");
        int totalPecas = scanner.nextInt();

        int caixasCheias = totalPecas / 12;
        int pecasSobrando = totalPecas % 12;

        System.out.println("Caixas Cheias (c/ 12 und): " + caixasCheias);
        System.out.println("Peças sobrando: " + pecasSobrando);

        scanner.close();
    }
}