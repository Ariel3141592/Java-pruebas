/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forvario;

import java.util.Scanner;

/**
 *
 * @author chich
 */
public class ForVario {

    public static void main(String[] args) {
        
        int pares=0 ,impares=0;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingresa el número");
        int maximo = lectura.nextInt();
        
        System.out.println("");
        for (int i = 1; i <= maximo; i++) {
            if (i % 2 == 0) {
                pares += i;
            } else {
                impares++;
            }
        }
        
        System.out.println("La suma de todos los pares es: "+ pares);
        System.out.println("Hay "+ impares+" numeros impares");
    }
}
