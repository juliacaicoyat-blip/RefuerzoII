import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[]numeros=new int[]{2,1,4,3,6};
        int falta=-1;
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length-1; i++) {
            if (numeros[i+1]-numeros[i] !=1){
                falta=numeros[i]+1;
                break;

            }

        }
    }
    public static int cualFalta(int[] numeros){
        return -1;
    }
}
