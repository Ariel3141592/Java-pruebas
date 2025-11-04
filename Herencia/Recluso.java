package com.mycompany.principal;

public class Recluso extends Persona /*Proviene de la clase persona, es decir, es "hijo" de Persona*/ {
    int id_carcel; /* Parametros del hijo" */
    int tiempoCarcel;

    public Recluso() {
    }

    public Recluso(int id_carcel, int tiempoCarcel, int edad, String nombre, String apellido, int cedula) {
        super(edad, nombre, apellido, cedula);
        this.id_carcel = id_carcel;
        this.tiempoCarcel = tiempoCarcel;
    }

    public int getId_carcel() {
        return id_carcel;
    }

    public void setId_carcel(int id_carcel) {
        this.id_carcel = id_carcel;
    }

    public int getTiempoCarcel() {
        return tiempoCarcel;
    }

    public void setTiempoCarcel(int tiempoCarcel) {
        this.tiempoCarcel = tiempoCarcel;
    }
    
    
    
}
