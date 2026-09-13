import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculadorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("Digite a data de nascimento (DD-MM-AAAA): ");
        LocalDate nascimento = LocalDate.parse(scanner.next(), formato);

        System.out.print("Digite a data atual (DD-MM-AAAA): ");
        LocalDate atual = LocalDate.parse(scanner.next(), formato);

        Period periodo = Period.between(nascimento, atual);
        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int diasTotais = periodo.getDays();

        int semanas = diasTotais / 7;
        int dias = diasTotais % 7;

        boolean maiorDeIdade = anos >= 18;

        System.out.printf("Idade: %d anos, %d meses, %d semana(s), %d dia(s)\n", anos, meses, semanas, dias);
        System.out.println("Maior de idade (>= 18): " + maiorDeIdade);

        scanner.close();
    }
}