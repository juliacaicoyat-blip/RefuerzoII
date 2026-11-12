public class Ejercicio3 {
    public static void main(String[] args) {
        String digitos="1234";
        int suma=0;
        String res="";
        System.out.println(sumaDigitos(digitos) );
        for (int i = 0; i < digitos.length(); i++) {
            suma+=Character.getNumericValue(digitos.charAt(i));
            if(i==digitos.length()-1){
                res+=digitos.charAt(i)+"="+suma;
            }else{
                res+=digitos.charAt(i);
            }

        }
        System.out.println(res);
    }
    public static String sumaDigitos(String digitos){
        return "";
    }
}
