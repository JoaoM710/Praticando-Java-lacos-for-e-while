import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        while (true) {
            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            String entrada = scanner.nextLine();

            if (entrada.equals("fim")) {
                break;
            }

            int numero = Integer.parseInt(entrada);

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }

        System.out.println("Númeross positivos: " + positivos);
        System.out.println("Númeross negativos: " + negativos);

        scanner.close();
    }
}
