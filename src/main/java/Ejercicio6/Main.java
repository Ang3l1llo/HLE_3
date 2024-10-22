package Ejercicio6;

public class Main {
    public static void main(String[] args) {

        //Kotlin tiene una seguridad mayor que java frente a los nulos, porque los trata de
        //forma explícita, obligandote a controlarlos
        //En java sin embargo es un clásico que te salte el NullPointerException
        String personaje = null;
        if (personaje != null) {
            System.out.println("El personaje es " + personaje);
        } else {
            System.out.println("No hay personaje.");
        }

    }
}