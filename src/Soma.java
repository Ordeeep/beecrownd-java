import java.util.Scanner;

//Lembre-se de alterar a classe "Soma" para Main
public class Soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declaração das variaveis e entrada de dados
        int A = input.nextInt();
        int B = input.nextInt();
        // Tratamento dos dados
        int SOMA = A + B;
        // Saida de dados
        System.out.println("SOMA = " + SOMA);
        input.close();
    }
}
