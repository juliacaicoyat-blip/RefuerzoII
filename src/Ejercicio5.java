import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] n= {1,4,5,6,8};
        Arrays.sort(n); // 1 4 5 6 8 9
        double med=0;
        System.out.println(mediana(n));
        if (n.length%2==0){
            int n1=n[n.length/2];
            int n2=n[(n.length-1)/2];
            System.out.println(med);
        } else {
            int n1=n[n.length/2];
            System.out.println(med);

        }

    }

    public static double mediana(int n[]){
        double med = 0;
        if (n.length%2==0){
            int n1=n[n.length/2];
            int n2=n[(n.length-1)/2];
            System.out.println(med);
        } else {
            int n1=n[n.length/2];
            System.out.println(med);

        }

        return 0;
    }
}

