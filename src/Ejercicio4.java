import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros={1,3,1,8,3,1,8,3,3};
        Arrays.sort(numeros);
        int moda=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]==moda) {
                System.out.println("es el numero "+moda+" la moda");
                break;
            }

        }
    }
}
