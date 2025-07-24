import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite dois números inteiros:");
        int numero1 = leitor.nextInt();
        int numero2 = leitor.nextInt();

        if (numero1 == numero2){
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
        }if (numero1 > numero2) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else {
            System.out.println("O segundo número é maior que o primeiro.");
        }
    }
}
