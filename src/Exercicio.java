import java.util.Random;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numeroGerado = new Random().nextInt(10);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite um numero entre 1 a 10");
            numeroDigitado = leitura.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabens, você o numero em " + tentativas + "tentativas");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número é menor que o número gerado.");

            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }
        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }
    }
}