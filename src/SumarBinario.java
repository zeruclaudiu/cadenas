import java.util.Scanner;

public class SumarBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero1;
        String numero2;
        int acarreo = 0;
        int suma = 0;
        String resultado = "";
        System.out.println("Introduce el primero numero binario (mismas cifras que numero 2) ");
        numero1 = sc.nextLine();

        System.out.println("Introduce el segundo numero binario (mismas cifras que numero 1) ");
        numero2 = sc.nextLine();
        if (numero1.length() == numero2.length()) {

        for (int i = numero1.length() - 1; i >= 0; i--) {
            int digito1 = Character.getNumericValue(numero1.charAt(i));
            int digito2 = Character.getNumericValue(numero2.charAt(i));
            suma = digito1 + digito2+acarreo;
            if (suma == 0) {
                resultado =  "0" + resultado;
                acarreo = 0;
            }else if (suma == 1){
                resultado =  "1" + resultado;
                acarreo = 0;

            }else if (suma == 2) {
                resultado = "0" + resultado;
                acarreo = 1;
            }else {
                resultado = "1" + resultado;
                acarreo = 1;
            }
        }
        if (acarreo == 1) {

            resultado = "1" + resultado;
        }
            System.out.println(resultado);
        }
        else {
            System.out.println("Los numeros no tienen las mismas cifras");
        }




    }
}
