/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java1;
import java.util.Scanner;   /*Se importa el Scanner*/
/**
 *
 * @author chich
 */
public class Java1 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); /*Se crea el Scanner*/
        
        System.out.println("introduzca su texto");
        String texto1 = entrada.nextLine(); /*Se usa nextLine para texto y nextInt para números*/
        
        System.out.println("Ingrese su segundo texto");
        String texto2 = entrada.nextLine();
        
        System.out.println("Su texto es: " + texto1 + texto2 );
        
        
        
    }
}
