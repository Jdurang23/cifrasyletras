import java.util.Random;
import java.util.Scanner;

public class App {
    // inicialización del escaner
    public static Scanner sc = new Scanner(System.in);
    public static Random r = new Random();
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
}
