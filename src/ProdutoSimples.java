import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int PROD = a * b;
        System.out.println("PROD = " + PROD);
    }
}
