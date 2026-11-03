
import java.util.Scanner;

public class NombreUsuario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre y dos apellidos: ");
        String nombreCompleto = sc.nextLine();

        // Eliminar espacios sobrantes al principio y al final
        nombreCompleto = nombreCompleto.trim();

        // Separar las palabras por espacios
        String[] palabras = nombreCompleto.split("\\s+");

        // Comprobar que hay exactamente tres palabras
        if (palabras.length != 3) {

            System.out.println("Error: debes introducir nombre y dos apellidos.");

        } else {

            // Formatear cada palabra
            for (int i = 0; i < palabras.length; i++) {
                palabras[i] = palabras[i].substring(0, 1).toUpperCase()
                        + palabras[i].substring(1).toLowerCase();
            }

            // Mostrar nombre completo formateado
            String nombreFormateado = String.join(" ", palabras);
            System.out.println("Nombre formateado: " + nombreFormateado);

            // Mostrar iniciales
            String iniciales = palabras[0].substring(0, 1) + "."
                    + palabras[1].substring(0, 1) + "."
                    + palabras[2].substring(0, 1) + ".";

            System.out.println("Iniciales: " + iniciales);

            // Generar nombre de usuario
            String usuario = palabras[0].substring(0, 1)
                    + palabras[1]
                    + palabras[2].substring(0, 1);

            System.out.println("Nombre de usuario: " + usuario.toLowerCase());
        }

        sc.close();
    }
}
