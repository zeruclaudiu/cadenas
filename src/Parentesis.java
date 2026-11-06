import java.util.Scanner;

public class Parentesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe  una frase con paréntesis: ");
        String frase = sc.nextLine();
        String[] palabras = frase.split("\\s+");
        int contador=0;
        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].charAt(0) == '('){
                contador++;
              }
            if (palabras[i].charAt(palabras[i].length()-1) == ')') {
                contador--;
            }

        }
        if(contador==0){
            System.out.println("La frase esta bien");
        }else {
            System.out.println("La frase esta mal");
        }
    }
}
