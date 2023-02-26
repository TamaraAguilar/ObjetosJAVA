package com.generation.objetos23febrero.models;

public class Animal {
    public String nombre;
    public String raza;
    public String pelaje;
    public Boolean vacunados;
    
    
    
    /*-------------------CONSTRUCTORES-------------------- */
    
    
    public Animal() {
    }
    public Animal(String nombre, String raza, String pelaje, Boolean vacunados) {
        this.nombre = nombre;
        this.raza = raza;
        this.pelaje = pelaje;
        this.vacunados = vacunados;
    
    
    /*-------------------GETTERS Y SETTERS-------------------- */

    
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getPelaje() {
        return pelaje;
    }
    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }
    public Boolean getVacunados() {
        return vacunados;
    }
    public void setVacunados(Boolean vacunados) {
        this.vacunados = vacunados;
    }


    /*-------------------TOSTRING()-------------------- */


    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", raza=" + raza + ", pelaje=" + pelaje + ", vacunados=" + vacunados + "]";
    }


    
    public void caminar() {
        System.out.println("Caminar, caminar :D");
    }



    
}



