package com.generation.objetos23febrero.models;

public class RegistroEquipo {
        public String marca;
        public String modelo;
        public String numSerie;
        
        
        
        public RegistroEquipo() {
        }


        public RegistroEquipo(String marca, String modelo, String numSerie) {
            this.marca = marca;
            this.modelo = modelo;
            this.numSerie = numSerie;
        }


        public String getMarca() {
            return marca;
        }


        public void setMarca(String marca) {
            this.marca = marca;
        }


        public String getModelo() {
            return modelo;
        }


        public void setModelo(String modelo) {
            this.modelo = modelo;
        }


        public String getNumSerie() {
            return numSerie;
        }


        public void setNumSerie(String numSerie) {
            this.numSerie = numSerie;
        }


        @Override
        public String toString() {
            return "El equipo ingresado es de marca " + marca + ", modelo " + modelo + ", numSerie " + numSerie + ". ";
        }

        

        public void editar(){
            System.out.println("Editando Equipo");
        }
    
        public void registrar(){
            System.out.println("Registrando Equipo");
        }
    
        public void borrar(){
            System.out.println("Borrando Equipo");


}

}
