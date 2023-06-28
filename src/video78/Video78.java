
package video78;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class Video78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente=false,decreciente=false;
        
        System.out.println("Llenar el arreglo");
        for (int i=0;i<10;i++){
            System.out.print((i+1)+". Digite un numero: Programa");
            arreglo[i] = teclado.nextInt();
        }
        
        for (int i=0;i<9;i++){
            if(arreglo[i] < arreglo[i+1]){
                creciente=true;
            }
            if(arreglo[i] > arreglo[i+1]){
                decreciente=true;
            }
        }
        if(creciente==true && decreciente==false){
            System.out.println("\nEl arreglo está en forma creciente");
        }
        if(creciente==false && decreciente==true){
            System.out.println("\nEl arreglo está en forma decreciente");
        }
        if(creciente==true && decreciente==true){
            System.out.println("\nEl arreglo está desordenado");
        }
        if(creciente==false && decreciente==false){
            System.out.println("\nTodos los números del arreglo son los mismos");
        }
    }
    
}
