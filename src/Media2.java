import java.util.Locale;
import java.util.Scanner;

//Lembre-se de alterar a class Media2 para Main
public class Media2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        // Declaração das variaveis e entrada de dados
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        // Tratamento de dados
        double media = ((A * 2) + (B * 3) + (C * 5)) / 10;
        // Saida de dados
        System.out.printf("MEDIA = %.1f%n", media);
    }
}
