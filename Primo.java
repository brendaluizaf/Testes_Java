import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = verificarNumeroPrimo(numero);

        if (ehPrimo) {
            System.out.println("Resultado: O número " + numero + " é primo.");
        } else {
            System.out.println("Resultado: O número " + numero + " não é primo.");
        }
    }

    public static boolean verificarNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        // Verificar divisibilidade do número por todos os inteiros de 2 até a raiz quadrada do número.
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    
    }
}
