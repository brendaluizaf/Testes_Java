import java.util.Scanner;
import java.util.ArrayList;

public class Media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do usuário
        System.out.print("Digite a lista de números separados por vírgula: ");
        String input = scanner.nextLine();

        // Converte a entrada em uma lista de números
        ArrayList<Double> numeros = new ArrayList<>();
        String[] numeroStr = input.split(",");
        for (String str : numeroStr) {
            try {
                double numero = Double.parseDouble(str);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Número inválido: " + str);
            }
        }

        // Chama a função para calcular a média e formata a saída
        double media = calcularMedia(numeros);
        String saida = formatarSaida(media);

        // Imprime o resultado
        System.out.println(saida);
    }

    // Função para calcular a média de uma lista de números
    public static double calcularMedia(ArrayList<Double> numeros) {
        if (numeros.isEmpty()) {
            return 0.0;
        }
        
        double soma = 0.0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma / numeros.size();
    }

    // Função para formatar a saída
    public static String formatarSaida(double media) {
        if (media > 0) {
            return "Resultado: A média dos números é " + media + ".";
        } else {
            return "Resultado: A lista está vazia, não é possível calcular a média.";
        }
    }
}
