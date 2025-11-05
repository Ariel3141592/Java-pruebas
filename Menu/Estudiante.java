package com.mycompany.pruebasolo;


public class Estudiante {
    
    double nota;
    String nombre;

    public Estudiante() {
    }

    public Estudiante(double nota, String nombre) {
        this.nota = nota;
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void Aprobacion(double nota){
        System.out.println("====================================");
        if(getNota() < 6.99){
            System.out.println("El estudiante "+ getNombre() + " No pasa, Tu nota es: "+ getNota());
        } else {
            System.out.println("El estudiante "+ getNombre() + " Si pasa, Tu nota es: "+ getNota());
        }
        System.out.println("====================================");
    }
    
}
