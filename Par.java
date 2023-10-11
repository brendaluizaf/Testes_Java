import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do usuário
        System.out.print("Digite a lista de números separados por vírgula: ");
        String input = scanner.nextLine();
        String[] numerosStr = input.split(",");
        List<Integer> numeros = new ArrayList<>();

        for (String numeroStr : numerosStr) {
            try {
                int numero = Integer.parseInt(numeroStr);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Número inválido: " + numeroStr);
            }
        }

        // Chama a função de soma e formata a saída
        int soma = somaNumerosPares(numeros);
        String saida = formatarSaida(soma);

        // Imprime o resultado
        System.out.println(saida);
    }

    // Função para calcular a soma dos números pares em uma lista
    public static int somaNumerosPares(List<Integer> numeros) {
        int soma = 0;
        boolean temPares = false;

        for (int numero : numeros) {
            if (numero % 2 == 0) {  // Verifica se o número é par
                soma += numero;
                temPares = true;
            }
        }

        return soma;
    }

    // Função para formatar a saída
    public static String formatarSaida(int soma) {
        if (soma > 0) {
            return "Resultado: A soma dos números pares é " + soma + ".";
        } else {
            return "Resultado: A lista não contém números pares.";
        }
    }
}



