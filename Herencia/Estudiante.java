/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author chich
 */
public class Estudiante extends Persona {
    
    int id_universidad;
    int tiempo_carrera;
    int calificacion;

    public Estudiante() {
    }

    public Estudiante(int id_universidad, int tiempo_carrera, int calificacion, int edad, String nombre, String apellido, int cedula) {
        super(edad, nombre, apellido, cedula);
        this.id_universidad = id_universidad;
        this.tiempo_carrera = tiempo_carrera;
        this.calificacion = calificacion;
    }

    public int getId_universidad() {
        return id_universidad;
    }

    public void setId_universidad(int id_universidad) {
        this.id_universidad = id_universidad;
    }

    public int getTiempo_carrera() {
        return tiempo_carrera;
    }

    public void setTiempo_carrera(int tiempo_carrera) {
        this.tiempo_carrera = tiempo_carrera;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
    
}
