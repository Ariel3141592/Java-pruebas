/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;
import java.util.Scanner;

/**
 *
 * @author chich
 */
public class Mavenproject2 { /*El Scanner debe estar dentro del main*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingreses un numero");
        int numero1 = scanner.nextInt();
        
        System.out.println("Ingreses un segundo número");
        int numero2 = scanner.nextInt();
        
        int suma = numero1 + numero2; /*Se debe declarar la suma de la forma correcta*/
        System.out.println("La suma de ambos numeros es: ");
        System.out.println(suma);
        
    }
}
