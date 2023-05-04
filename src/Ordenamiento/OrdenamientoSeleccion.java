package Ordenamiento;

import java.util.Random;

/* @author Betterlee
 */
public class OrdenamientoSeleccion {

    private int[] datos; 
    private static Random generador = new Random();

    public OrdenamientoSeleccion(int tamanio) {
        datos = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            datos[i] = 10 + generador.nextInt(90);
        }
    }

    public void ordenar() {
        int masPequenio;
        for (int i = 0; i < datos.length - 1; i++) {
            masPequenio = i; // primer índice del resto del arreglo
            for (int indice = i + 1; indice < datos.length; indice++) {
                if (datos[indice] < datos[masPequenio]) {
                    masPequenio = indice;
                }
            }
            intercambiar(i, masPequenio);
            imprimirPasada(i + 1, masPequenio);
        }
    }

    public void intercambiar(int primero, int segundo) {
        int temporal = datos[primero];
        datos[primero] = datos[segundo];
        datos[segundo] = temporal;
    }

    public void imprimirPasada(int pasada, int indice) {
        System.out.print(String.format("despues de pasada %2d: ", pasada));
        for (int i = 0; i < indice; i++) {
            System.out.print(datos[i] + " ");
        }
        for (int i = indice + 1; i < datos.length; i++) {
            System.out.print(datos[indice] + "* ");
        }

        for (int i = indice + 1; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
            System.out.print("\n     ");

            for (int j = 0; j < pasada; j++) {
                System.out.print("-- ");
                System.out.println("\n");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder temporal = new StringBuilder();
        for (int elemento : datos) {
            temporal.append(elemento + " ");
        }
        temporal.append("\n"); // agrega carácter de nueva línea
        return temporal.toString();
    }

}
