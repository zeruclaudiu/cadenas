import java.util.Scanner;

public class Siglas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();


        String siglas = "";

        String[] palabras = frase.split("\\s+");

        for (int i = 0; i < palabras.length; i++) {

            if (Character.isUpperCase(palabras[i].charAt(0))) {
                siglas += palabras[i].charAt(0);
                System.out.println("Las siglas son: " + siglas);


            }
        }






    }
}
