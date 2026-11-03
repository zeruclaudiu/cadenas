
import java.util.Scanner;

public class Longitud3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.print("Introduce el valor de k: ");
        int k = sc.nextInt();

        String[] palabras = frase.split("\\s+");

        boolean corta = true;

        for (int i = 0; i < palabras.length; i++) {

            if (palabras[i].length() >= k) {
                corta = false;
            }

        }

        if (corta) {
            System.out.println("Todas las cadenas son cortas");
        } else {
            System.out.println("Hay alguna palabra larga");
        }

        sc.close();
    }
}
