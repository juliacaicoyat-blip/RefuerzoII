public class Ejercicio10 {
    public static void main(String[] args) {
        int compartimientos=0;
        int maxLitros=10;
        int diferencia=0;
        int litros=0;
        int liitrosActual=maxLitros;
        System.out.println(litros(compartimientos,maxLitros,diferencia));
        for (int i = 0; i < compartimientos; i++) {
            litros+=liitrosActual;
            liitrosActual-=diferencia;

        }

        
    }
    public static int litros( int compartimientos,int maxLitros,int diferencia ){
        int litros=0;
        int liitrosActual=maxLitros;
        for (int i = 0; i < compartimientos; i++) {
            litros+=liitrosActual;
            liitrosActual-=diferencia;

        }

        return compartimientos;
    }
}
