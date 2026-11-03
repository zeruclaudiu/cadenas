
import java.util.Scanner;

public class Analizar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        // Longitud
        System.out.println("Longitud: " + palabra.length());

        // Primera y última letra
        System.out.println("Primera letra: " + palabra.charAt(0));
        System.out.println("Última letra: " + palabra.charAt(palabra.length() - 1));

        // Mayúsculas y minúsculas
        System.out.println("Mayúsculas: " + palabra.toUpperCase());
        System.out.println("Minúsculas: " + palabra.toLowerCase());

        // Contar las letras a
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A') {
                contador++;
            }
        }

        System.out.println("Número de letras a: " + contador);

        sc.close();
    }
}
