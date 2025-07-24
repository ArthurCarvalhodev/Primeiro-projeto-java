import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:  ");
        int numero = leitor.nextInt();

        System.out.println("tabuada do  " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
    }
}
