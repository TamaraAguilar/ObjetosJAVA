package com.generation.objetos23febrero.models;

public class Computador extends RegistroEquipo {
     /*******************ATRIBUTOS**********************/
    public String teclado;
    public Boolean wifi;
    public Boolean bluetooth;





    /*******************CONSTRUCTORES**********************/


    public Computador() {
        super();
    }


    public Computador(String marca, String modelo, String numSerie, String teclado, Boolean wifi, boolean bluetooth) {
        super(marca, modelo, numSerie);
        this.teclado = teclado;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
    }



    /*******************GETTERS Y SETTERS**********************/

    
 
    public String getTeclado() {
        return teclado;
    }


    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }


    public Boolean getWifi() {
        return wifi;
    }


    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }


    public boolean isBluetooth() {
        return bluetooth;
    }


    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }


   



    /*******************MÉTODOS**********************/

    public String jugar(){
        return "El computador está ejecutando el Stardew Valley";
    }


    public String programar(){
        return "El computador ejecuta VSCode y permite programar";
    }


    public String encender(){
        return "El computador se enciende";
    }


    public String apagar(){
        return "El computador se apaga";
    }


    public void prenderApagar(boolean estado){
        if(estado == true){
            System.out.println("Equipo encendido");
        }else{
            System.out.println("Equipo apagado");
        }
    }

    
    public String procesarTexto(){
        return "El equipo procesa texto";
    }


    @Override
    public String toString() {
        return super.toString() + "Es un computador que " + teclado + ", wifi=" + wifi + ", bluetooth=" + bluetooth + " .";
    }


}
