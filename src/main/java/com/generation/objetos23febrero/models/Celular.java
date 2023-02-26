package com.generation.objetos23febrero.models;

public class Celular extends RegistroEquipo {
     /*******************ATRIBUTOS**********************/
     public Boolean camara;






    /*******************CONSTRUCTORES**********************/


    public Celular() {
        super();
    }



    public Celular(String marca, String modelo, String numSerie, Boolean camara) {
        super(marca, modelo, numSerie);
        this.camara = camara;
    }



    /*******************GETTERS Y SETTERS**********************/

    

    public Boolean getCamara() {
        return camara;
    }



    public void setCamara(Boolean camara) {
        this.camara = camara;
    }




    /*******************MÉTODOS**********************/


    public String jugar(){
        return "El celular está ejecutando el Stardew Valley";
    }


    public String tomarFotos(){
        return "El celular abre la aplicación de Cámara y toma fotos";
    }

    public String navegarInternet(){
        return "El celular abre el navegador y permite navegar Internet";
    }

    public String encender(){
        return "El celular se enciende";
    }


    public String apagar(){
        return "El celular se apaga";
    }



    @Override
    public String toString() {
        return super.toString() + "Es un celular que camara= " + camara + " .";
    }


    
   
}
