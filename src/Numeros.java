public class Numeros {
    public static void main(String[] args) {
       String cadena= "123 54a6 15v 266";
       String[] palabras = cadena.split("\\s+");
        boolean esNumero=true;
        int contador= 0;
        for(int i=0;i<palabras.length;i++){
            esNumero=true;

            for(int j=0;j<palabras[i].length();j++){
                if (!Character.isDigit(palabras[i].charAt(j))){
                    esNumero=false;
                    break;
                }
            }
            if (esNumero){
                contador++;
            }            System.out.print(palabras[i]+" ");
        }
        System.out.println("La cantidad de numeros es " + contador);
    }
}
