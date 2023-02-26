package com.generation.objetos23febrero.models;

//Aquí yo estoy diciendo que Gato hereda los atributos y métodos de Animal
public class Gato extends Animal {
    
    public Integer cantBigotes;
//Quiero que cuando cree un gato también tenga considerado los atributos de la clase animal
//Para decirle a gato que va a heredar algo de otra clase ocupamos extends

    public Gato(){
        //trae los datos de animal y embeds them to gato
        //el constructor por defecto de una clase hija debe tener la función super
        //para así obtener los atributos de Animal
        super();
    }


    //
    public Gato(String nombre, String raza, String pelaje, Boolean vacunados, Integer cantBigotes) {
        super(nombre, raza, pelaje, vacunados);
        this.cantBigotes = cantBigotes;
    }


    public Integer getCantBigotes() {
        return cantBigotes;
    }


    public void setCantBigotes(Integer cantBigotes) {
        this.cantBigotes = cantBigotes;
    }


    @Override
    public String toString() {
        //concatenamos el toString desde Animal
        return super.toString() + "Gato [cantBigotes=" + cantBigotes + "]";
    }

    public void maullar() {
        System.out.println("Miau :3");
    }

}
