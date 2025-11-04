package com.mycompany.principal;

public class Principal {

    public static void main(String[] args) {
        
        Recluso recluso1 = new Recluso();
        recluso1.setNombre("Ricardo");
        recluso1.setId_carcel(12345);
        
        System.out.println(recluso1.getNombre());
        System.out.println(recluso1.getId_carcel());
        
        System.out.println("---------------------");
        
        
        Estudiante estudiante1 = new Estudiante(1111, 4, 23, 12, "Juan", "Altamirano", 8888);
        System.out.println(estudiante1.getApellido());
        System.out.println(estudiante1.getId_universidad());
    }
}
