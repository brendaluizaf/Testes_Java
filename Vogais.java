import java.util.Scanner;

public class Vogais{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String frase = scanner.nextLine();
         
        int numeroDeVogais = contarVogais(frase);

        if (numeroDeVogais > 0) {
            System.out.println("Resultado: A frase possui " + numeroDeVogais + " vogais.");
        } else {
            System.out.println("Resultado: A frase não possui vogais.");
        }
    }

    public static int contarVogais(String frase) {
        int contador = 0;
        // Converter a frase para letras minúsculas para facilitar a verificação.
        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        return contador;
    }
}


