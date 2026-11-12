public class Ejercicio6 {
    public static void main(String[] args) {
        int[] n = {2, 4, 6, 8};
        double par = 0;
        boolean hyperpar = true;
        System.out.println(esHyperpar(n));
        for (int i = 0; i < n.length; i++) {
            if (!(n[i] % 2 == 0)) {
                hyperpar = false;
                break;
            }
        }
        if (hyperpar){
            System.out.println("Sí");
        }else{
            System.out.println("no");
        }
    }
    public static boolean esHyperpar(int[] n){

        return true;
    }
}