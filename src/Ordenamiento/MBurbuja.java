package Ordenamiento;


import java.util.Scanner;
import javax.swing.JOptionPane;

/* @author Betterlee*/
 
public class MBurbuja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], elementos, aux;
        
        elementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos del arreglo "));
        arreglo= new int[elementos];
        
        for ( int i=0; i<elementos; i++){
            System.out.println((i+1)+ " Ingresa un numero ");
            arreglo[i] = entrada.nextInt();
        }
        
        for (int i=0; i<(elementos-1);i++){
            for(int j=0; j<(elementos-1); j++){
                if(arreglo[j]> arreglo[j+1]){
                    aux= arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1]= aux;
                }
            }
        }

        System.out.println("\nArreglo ordenado de forma creciente: ");
                for(int i=0; i<elementos; i++){
                    System.out.println(arreglo[i] + " ");
                }
                System.out.println("\nArreglo ordenado de forma decreciente");
                for(int i =(elementos-1); i>=0; i--){
                    System.out.println(arreglo[i] + " ");
                }
        System.out.println("" );
}
}
