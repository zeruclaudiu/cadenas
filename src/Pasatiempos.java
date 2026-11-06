import java.util.Scanner;

public class Pasatiempos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();
        String pasatiempo= "";
        boolean esVocal = false;
        for (int i = 0; i < frase.length(); i++) {
            if ("aeiou".contains(""+frase.charAt(i))) {
                pasatiempo += ".";

            }else  {
                pasatiempo += frase.charAt(i);
            }
        }
        System.out.println(pasatiempo);
    }
}

