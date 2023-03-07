
//Import do locale para mudar poder usar o **ponto** ao inves da **virgula** em numeros quebrado.
import java.util.Locale;
import java.util.Scanner;

public class AreadoCirculo {
    public static void main(String[] args) {
        // Setando o idioma americano.
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        // Declaração das variaveis e Entrada de dados.
        double n = 3.14159;
        double raio = input.nextDouble();
        // Tratando os dados.
        double area = n * (Math.pow(raio, 2));
        // Saida de dados.
        System.out.printf("A=%.4f%n", area);
        // Fechando o input mas não é obrigatorio.
        input.close();
    }
}
