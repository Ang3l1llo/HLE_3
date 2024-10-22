package Ejercicio4;

public class Main {
    public static void main(String[] args) {

        //La diferencia entre break y continue es que break rompe de forma forzada
        //y sale del bucle o donde estes, mientras que el continue saltaría una y
        //pasaría en este caso a la siguiente iteración
        //Con el break imprime 1 2, mientras que el continue imprime 1,2,4,5
        for(int i = 1; i < 6; i++){
            if(i == 3) break;
            System.out.println("Numero: "+(i));
        }
    }
}