package com.mycompany.pruebasolo;
import java.util.Scanner;
/*Codigo hecho mayormente con chatgpt*/
public class PruebaSolo {

    public static void main(String[] args) {
        
        Scanner ingresar = new Scanner(System.in);
        Estudiante estudiante1 = new Estudiante();
        int opcion; // Variable para controlar el menú
        
        do {
            System.out.println("============ Menú ============");
            System.out.println("1. Ingresar datos del estudiante");
            System.out.println("2. Mostrar aprobación");
            System.out.println("0. Salir");
            System.out.print("===  Elige una opción:  ===");
            
            opcion = ingresar.nextInt(); // leer opción numérica
            
            switch (opcion) {
                case 1:
                    ingresar.nextLine(); // limpiar el buffer
                    System.out.print("Ingrese el nombre: ");
                    String nombre = ingresar.nextLine();
                    estudiante1.setNombre(nombre);
                    
                    System.out.print("Ingrese la nota: ");
                    double nota = ingresar.nextDouble();
                    estudiante1.setNota(nota);
                    break;
                    
                case 2:
                    estudiante1.Aprobacion(estudiante1.getNota());
                    break;
                    
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
            
        } while (opcion != 0);
        
        ingresar.close();
    }
}
