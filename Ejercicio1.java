/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

    import java.util.Scanner;

public class Ejercicio1 {

    private static Scanner teclado = new Scanner(System.in);
    private static int MILL_METR = 1852;
    
    public static void main(String[] args) {
       
        System.out.print("Introduzca las millas: ");
        int DMillas = teclado.nextInt();
        
        int DMetros = DMillas * MILL_METR;
        System.out.print("El resultado en metros es: " + DMetros + "\n");
        
        
    }
    
}
