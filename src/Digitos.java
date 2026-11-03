
import java.util.Scanner;

public class Digitos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String texto = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {

            if (Character.isDigit(texto.charAt(i))) {
                contador++;
            }

        }

        System.out.println("Cantidad de dígitos: " + contador);

        sc.close();
    }
}
