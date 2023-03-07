import java.util.Locale;
import java.util.Scanner;

//Lembre-se de alterar a classe "Media1" para Main
public class Media1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        // Declaracao das variaveis e entrada de dados
        double A = input.nextDouble();
        double B = input.nextDouble();
        // Tratamento de dados
        double media = ((A * 3.5) + (B * 7.5)) / 11;
        // Saida de dados
        System.out.printf("MEDIA = %.5f%n", media);
    }
}