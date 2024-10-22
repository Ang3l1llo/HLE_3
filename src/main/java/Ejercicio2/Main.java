package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        //En java el operador ternario funciona similar al elvis en kotlin
        //Primero la condición, luego un interrogante y lo que sucede si se cumple(if)
        //Segundo dos puntos seguido de lo que sucede si no se cumple(else)
        int energia = 80;
        String estado = (energia > 50) ? "Personaje fuerte" : "Personaje débil";
        System.out.println(estado);
    }
}