package Ordenamiento;

/* @author Betterlee
 */
public class PruebaSelec {

    public static void main(String[] args) {
        OrdenamientoSeleccion Orden = new OrdenamientoSeleccion(10);
        System.out.println("Arreglo desordenado:");
        System.out.println(Orden);
        Orden.ordenar();
        System.out.println("Arreglo ordenado:");
        System.out.println(Orden);
    }
}
