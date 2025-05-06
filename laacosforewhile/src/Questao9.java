import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int limite = scanner.nextInt();
        for (int i = 1; i <= limite; i++) {
            if (i % 10 == 5) {
                continue;
            }
            System.out.println(i + " ");
        }
        scanner.close();
    }
}
