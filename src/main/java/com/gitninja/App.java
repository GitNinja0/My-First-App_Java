package com.gitninja;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Persona Juan = new Persona("Juan", 18, 15151515, "Tegucigalpa", "H");
        Persona Carlos = new Persona("Carlos", 20, 15151515, "Gijon", "H");

        Juan.infoPersona();
        System.out.println("*------------------------------* \n");
        Carlos.infoPersona();
        System.out.println("Hello World!");
    }
}
