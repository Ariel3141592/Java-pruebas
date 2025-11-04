/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        double a=0,b=0;
        Scanner entrada = new Scanner(System.in);
        
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        double c=a+b;
        System.out.println(c);
        
        entrada.close();
}
}
