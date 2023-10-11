import java.util.Scanner;

public class ContagemPalavra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do usuário
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Chama a função para contar palavras e formata a saída
        int numeroDePalavras = contarPalavras(frase);
        String saida = formatarSaida(numeroDePalavras);

        // Imprime o resultado
        System.out.println(saida);
    }

    // Função para contar palavras em uma frase
    public static int contarPalavras(String frase) {
        String[] palavras = frase.trim().split("\\s+"); // Divide a frase em palavras
        int numeroDePalavras = 0;
        
        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                numeroDePalavras++;
            }
        }
        
        return numeroDePalavras;
    }

    // Função para formatar a saída
    public static String formatarSaida(int numeroDePalavras) {
        if (numeroDePalavras > 0) {
            return "Resultado: A frase possui " + numeroDePalavras + " palavras.";
        } else {
            return "Resultado: A frase não possui palavras.";
        }
    }
}


