
import java.util.Scanner;

public class Longitud2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.print("Introduce la longitud k: ");
        int k = sc.nextInt();

        // Separar la frase en palabras
        String[] palabras = frase.split("\\s+");

        int contador = 0;

        // Recorrer todas las palabras
        for (int i = 0; i < palabras.length; i++) {

            if (palabras[i].length() == k) {
                contador++;
            }

        }

        System.out.println("Hay " + contador + " palabras con longitud " + k);

        sc.close();
    }
}
