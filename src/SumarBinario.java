import java.util.Scanner;

public class SumarBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero1;
        String numero2;
        int acarreo = 0;
        int suma;
        String resultado = "";
        System.out.println("Introduce el primero numero binario (mismas cifras que numero 2) ");
        System.out.println("Introduce el segundo numero binario (mismas cifras que numero 1) ");
        numero1 = sc.nextLine();
        numero2 = sc.nextLine();
        if (numero1.length() == numero2.length()) {

        for (int i = numero1.length() - 1; i >= 0; i--) {

            // 1. Obtener los dos dígitos.
            int digito1 = Character.getNumericValue(numero1.charAt(i));
            int digito2 = Character.getNumericValue(numero2.charAt(i));

            // 2. Sumarlos junto con el acarreo.

            // 3. Calcular el nuevo acarreo.

            // 4. Añadir el dígito al resultado.

            }
        }
        else {
            System.out.println("Los numeros no tienen las mismas cifras");
        }




    }
}
