package com.mycompany.principal;

public class Estudiante {
    /*Se asignan las variables de la clase*/
    private int edad;
    private String nombre;
    private String apellido;
    private int calificacion;
    
    /*Crea un objeto vacio*/
    public Estudiante(){
    }
    
    /*Crea un objeto con todos los atributos*/
    public Estudiante(int edad, String nombre, String apellido, int calificacion) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion = calificacion;
    }
    
    /*getters y setters*/
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
    /*Una acción o metodo*/
    public void aprobacion(double calificacion){
        System.out.println("----------------------");
        System.out.println(nombre);
        
        
        if(calificacion>=7){
            System.out.println("Aprueba");
        } else {
            System.out.println("Desaprueba");
        }
        
    }
}
