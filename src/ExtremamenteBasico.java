import java.util.Scanner;

//Lembre-se de alterar a classe "ExtremamenteBasico" para Main
public class ExtremamenteBasico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declaração das variaveis
        int A, B, X;
        // Entrada de dados
        A = input.nextInt();
        B = input.nextInt();
        // Tradando os dados
        X = A + B;
        // Saida
        System.out.println("X = " + X);
        input.close();
    }
}
