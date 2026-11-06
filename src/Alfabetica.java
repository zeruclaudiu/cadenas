import java.util.Scanner;

public class Alfabetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String palabra = input.nextLine();

        boolean alfabetica = true;
        for (int i = 0; i < palabra.length()-1; i++){
            if (palabra.charAt(i) > palabra.charAt(i+1)){
                alfabetica = false;

                System.out.println(palabra+ " -> No ");
                break;
            }

        }
        if (alfabetica){

            System.out.println(palabra+ " -> Si ");
        }

    }
}
