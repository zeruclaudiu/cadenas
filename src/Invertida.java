import java.util.Scanner;

public class Invertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        String[] palabras= frase.split("\\s+");

for (int i = palabras.length - 1 ;i>=0; i--) {


    System.out.print(palabras[i] + " ");
}
    }

}
