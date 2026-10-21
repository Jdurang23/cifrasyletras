import java.util.Random;
import java.util.Scanner;

public class App {
    // inicialización del escaner
    public static Scanner sc = new Scanner(System.in);
    public static Random rng = new Random();
    // puntuaciones globales jugadores

    public static int puntosGlobalesJ1 = 0;
    public static int puntosGlobalesJ2 = 0;

    // puntuaciones de cada prueba

    public static int puntosPruebaJ1 = 0;
    public static int puntosPruebaJ2 = 0;

    // parametros configuración

    public static int repeticionPrueba = 0;
    public static int modoJuego = 0;
    public static int cantidadLetras = 0;
    public static int cantidadOperacionesCalculadora = 0;

    // datos desarrollo partida

    public static void main(String[] args) {

        do {
            System.out.println("-BIENVENIDO AL CONCURSO CIFRAS Y LETRAS-");
            System.out.println("Seleccione un juego:");
            System.out.println("1.-Modo rápido");
            System.out.println("2.-Concurso");
            System.out.println("3.-Configuración del juego");
            System.out.println("4.-Salir");
            modoJuego = sc.nextInt();

            switch (modoJuego) {

                case 1:

                    break;

                case 2:

                    break;

                default:
                    System.out.println("Opción Incorrecta");

            }

        } while (modoJuego != 4);

    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void cifraExacta(){
        int objetivo = rng.nextInt(100, 999);
        int auxiliar1 = rng.nextInt(1, 10);
        int auxiliar2 = rng.nextInt(1, 10);
        int auxiliar3 = rng.nextInt(1, 10);
        int auxiliar4 = rng.nextInt(1, 10);
        int auxiliar5 = rng.nextInt(1, 10);
        int auxiliar6 = rng.nextInt(1, 10);
        for (int i = 0; i < 5; i++) {
            System.out.println("El objetivo es: " + objetivo);
            System.out.println("los números auxiliarres son: " + "1)" + auxiliar1 + "2)" + auxiliar2 + "3)" + auxiliar3 + "4)" + auxiliar4 + "5)" + auxiliar5 + "6)" + auxiliar6);
            System.out.println("Jugador introduzca su primer número auxiliar");
            int auxiliarJ = sc.nextInt();
            switch (auxiliarJ) {
                case 1:
                    auxiliarJ = auxiliar1;
                    break;
                case 2:
                    auxiliarJ = auxiliar2;
                    break;
                case 3:
                    auxiliarJ = auxiliar3;
                    break;
                case 4:
                    auxiliarJ = auxiliar4;
                    break;
                case 5:
                    auxiliarJ = auxiliar5;
                    break;
                case 6:
                    auxiliarJ = auxiliar6;
                    break;
                default:
                    System.out.println("Ese número no es un auxiliar");
                    break;
        }
            //rondaCifraE(auxiliarJ);
        }
        
    };

    //public static int rondaCifraE(int auxiliarJ){};
}
