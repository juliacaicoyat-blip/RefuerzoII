public class Ejercicio2 {
    public static void main(String[] args) {
        //Este es el de nochevieja, haré uso de la IA Claude en caso de que sea necesario.
        //(suerte que los comentarios aquí son más fáciles que en xml)
        int dia=20,mes=12;
        System.out.println(diasHastaNochevieja(dia,mes));
        int[] diasMes={31,28,31,30,31,30,31,31,30,31,30,31};
        int res= diasMes[mes-1]-dia;

        /* Ya lo tengo + o -, ahora el algoritmo.
        Pero sé entiende que me */
        for (int i = 0; i < 12 ; i++) {
            res+=diasMes[i];
            
        }


    }
    public static int diasHastaNochevieja(int dia,int mes){

        int[] diasMes={31,28,31,30,31,30,31,31,30,31,30,31};
        int res= diasMes[mes-1]-dia;
        for (int i = 0; i < 12 ; i++) {
            res+=diasMes[i];

        }


        return res;
    }
}
