import java.util.Scanner;

public class InspecaoPecas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pixelsValidos = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int valor;

                while (true) {
                    System.out.print("Digite o valor do pixel [" + i + "][" + j + "]: ");
                    valor = scanner.nextInt();

                    if (valor < 0 || valor > 256) {
                        System.out.println("valor fora do intervalo: 0 a 256");
                    } else {
                        break;
                    }
                }

                if (valor == 256) {
                    continue;
                }

                if (valor >= 100 && valor <= 200) {
                    pixelsValidos++;
                }

                if (pixelsValidos >= 10) {
                    System.out.println("Peça boa! Atingiu 10 pixels válidos.");
                    break;
                }
            }

            if (pixelsValidos >= 10) {
                break;
            }
        }

        if (pixelsValidos < 10) {
            System.out.println("Peça não aprovada. Total de pixels válidos: " + pixelsValidos);
        }
        scanner.close();
    }
}