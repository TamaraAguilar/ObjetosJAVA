package com.generation.objetos23febrero.models;

public class Conejo extends Animal {
    
    public Double longitudOrejas;


    public Conejo() {
        super();
    }


    public Conejo(String nombre, String raza, String pelaje, Boolean vacunados, Double longitudOrejas) {
        super(nombre, raza, pelaje, vacunados);
        this.longitudOrejas = longitudOrejas;
    }


    public Double getLongitudOrejas() {
        return longitudOrejas;
    }


    public void setLongitudOrejas(Double longitudOrejas) {
        this.longitudOrejas = longitudOrejas;
    }


    @Override
    public String toString() {
        return super.toString() + "Conejo [longitudOrejas=" + longitudOrejas + "]";
    }

    public void saltarAlto() {
        System.out.println("Brinco Brinco");
    }
    

}
