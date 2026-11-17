import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros={1,3,1,8,3,1,8,3,3};
        Arrays.sort(numeros);
        System.out.println(moda(numeros));
        int resultado=0;
        int rep;
        int maximo=0;
        int moda=0;
        for (int i = 0; i < numeros.length; i++) {
            rep=0;
            for (int j = i+1; j < numeros.length ; j++) {
                if (numeros[i]==numeros[j]){
                    rep++;
                }

            }
            if (rep>maximo){
                maximo=rep;
                moda=numeros[i];

            }

        }
        System.out.println(moda);

    }


    public static int moda(int[] numeros){
        int resultado=0;
        int rep;
        int maximo=0;
        int moda=0;
        for (int i = 0; i < numeros.length; i++) {
            rep=0;
            for (int j = i+1; j < numeros.length ; j++) {
                if (numeros[i]==numeros[j]){
                    rep++;
                }

            }
            if (rep>maximo){
                maximo=rep;
                moda=numeros[i];

            }

        }
        System.out.println(moda);





        return moda;
    }
}
