/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*La sucesion de Finacci dentro del for fue hecho con la ayuda de IA*/
package com.mycompany.mavenproject3;
import java.util.Scanner; 
/**
 *
 * @author chich
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        int a = 0, b = 1, c;
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Sucesion de fibonacci");
        System.out.println("Introduzca la cantidad de sucesiones");
        int maximo = scanner.nextInt();
        
        for(int i=1; i <= maximo; i++ ){
            System.out.println(a); // imprime el número actual
            c = a + b;             // calcula el siguiente número
            a = b;                 // mueve 'b' a 'a'
            b = c;
        }
    }
}
