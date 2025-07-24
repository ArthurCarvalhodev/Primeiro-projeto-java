import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = leitor.nextInt();

        if (numero >= 0) {
            System.out.println("O número é positivo.");
        } else{
            System.out.println("O número é negativo.");
        }

    }
}
