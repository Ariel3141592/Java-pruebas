package com.mycompany.principal;

public class Persona { 
    private int edad; 
    private String nombre;
    private String apellido;/*Parametros generales*/
    private int cedula;

    public Persona() {
    }

    public Persona(int edad, String nombre, String apellido, int cedula) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
    
}
