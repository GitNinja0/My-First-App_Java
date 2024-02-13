package com.gitninja;

public class Persona {
    String Nombre;
    int Edad;
    int id;
    String ciudad;
    String genero;
    
    public Persona(String nombre, int edad, int id, String ciudad, String genero) {
        Nombre = nombre;
        Edad = edad;
        this.id = id;
        this.ciudad = ciudad;
        this.genero = genero;
    }

    public void infoPersona(){
        System.out.println("Nombre: "+ this.Nombre + "\n" + "Edad: "+ this.Edad + "\n" + "Ciudad: "+ this.ciudad + "\n" + "Identificacion: "+ this.id + "\n" + "Genero: "+ this.genero + "\n");
    }
    
}
