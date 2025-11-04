package com.mycompany.principal;

public class Principal {

    public static void main(String[] args) {
        
        /*La creacion de dos objetos*/
        Estudiante estudiante1 = new Estudiante(12, "Margot", "Quilua",8); /*Con datos*/
        Estudiante estudiante2 = new Estudiante(); /*Sin datos*/
        
        /*El uso de un metodos*/
        estudiante1.aprobacion(estudiante1.getCalificacion()); /*Se usa el metodo de aprobacion*/
        System.out.println(estudiante1.getCalificacion()); /*Se usa el getter de calificacion*/
        
        /*Se usa el setter para dar informacion al objeto que al principio no tenia informacion*/
        estudiante2.setCalificacion(1);
        estudiante2.setNombre("Roberto");
        estudiante2.aprobacion(estudiante2.getCalificacion()); /*Se usa el metodo de aprobacion*/
        System.out.println(estudiante2.getCalificacion()); /*Se usa el getter de calificacion*/
        
        /*Se reescribe la informacion del objeto dos, pues estaba "incorrecta" */
        estudiante2.setCalificacion(10);
        estudiante2.setNombre("Robert");
        estudiante2.aprobacion(estudiante2.getCalificacion()); /*Se usa el metodo de aprobacion*/
        System.out.println(estudiante2.getCalificacion()); /*Se usa el getter de calificacion*/
    }
}
