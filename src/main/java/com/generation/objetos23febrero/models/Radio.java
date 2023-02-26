package com.generation.objetos23febrero.models;

public class Radio extends RegistroEquipo {
     /*******************ATRIBUTOS**********************/

    public Double alcance;
      







    /*******************CONSTRUCTORES**********************/


    public Radio() {
        super();
    }
   
   
    public Radio(String marca, String modelo, String numSerie, Double alcance) {
        super(marca, modelo, numSerie);
        this.alcance = alcance;
    }



    /*******************GETTERS Y SETTERS**********************/


    public Double getalcance() {
        return alcance;
    }


    public void setalcance(Double alcance) {
        this.alcance = alcance;
    }

   



    /*******************MÉTODOS**********************/

    public String escucharMusica(){
        return "La radio permite escuchar música";
    }

    public String captarSenial(){
        return "La radio puede captar señal";
    }

    public String cambiardeEmisora(){
        return "La radio permite cambiar de emisora";
    }


    public String encender(){
        return "La radio se enciende";
    }


    public String apagar(){
        return "La radio se apaga";
    }


    @Override
    public String toString() {
        return super.toString() + "Es una radio que tiene alcance " + alcance + " .";
    }


}

