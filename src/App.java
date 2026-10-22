import java.util.Random;
import java.util.Scanner;

public class App {
    // inicialización del escaner
    public static Scanner sc = new Scanner(System.in);
    public static Random r = new Random();
   // puntuacion prueba
    public static int puntosJ1 = 0;
    public static int puntosJ2 = 0;

    // puntuaciones globales
    public static int global1 = 0;
    public static int global2 = 0;
    

    // parametros configuración

    public static int repeticionPrueba = 0;
    public static int opcionMenu = 0;
    public static int modoJuego = 0;
    public static int modoRapido = 0;
    public static int cantidadLetras = 10;
    public static int cantidadOperacionesCalculadora = 5;

  

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
                        modoRapido();
                    break;

                case 2:
                        concurso();
                    break;
                case 3:
                    configuracionJuego();

                    break;

                default:
                    System.out.println("Opción Incorrecta");

            }

        } while (modoJuego != 4);

    }

    public static void configuracionJuego() {

        do {

            System.out.println("Menú de configuración , Introduzca una opción:");
            System.out.println("1.-Introduzca las veces en las que se repite: ");
            System.out.println("2.-Cantidad de letras: ");
            System.out.println("3.-Cantidad de operaciones: ");
            System.out.println("4.-Salir");
            opcionMenu = Integer.parseInt(sc.nextLine());

            switch (opcionMenu) {

                case 1:
                    System.out.println("Veces a repetir :");
                    repeticionPrueba = Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Introduzca número de letras: ");
                    cantidadLetras = Integer.parseInt(sc.nextLine());
                    break;

                case 3:
                    System.out.println("Introduzca número de operaciones");
                    cantidadOperacionesCalculadora = Integer.parseInt(sc.nextLine());
                    break;
                default:
                    System.out.println("Saliste del menú");
            }

        } while (opcionMenu != 4);
    }

    public static void modoRapido() {

        do {
            System.out.println("Has seleccionado MODO RÁPIDO, seleccione una prueba: ");
            System.out.println("1.-Cifra exacta");
            System.out.println("2.-La palabra más larga");
            System.out.println("3.-La calculadora humana");
            System.out.println("4.-Prueba original");
            System.out.println("5.-Salir");
            modoRapido = Integer.parseInt(sc.nextLine());

            switch (modoRapido) {

                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                default:System.out.println("Saliste del modo rápido");

            }

        } while (modoRapido != 5);

    }

    
    

   public static void modoConcurso() {

        //palabraMasLarga();
        //calculadoraHumana();

        System.out.println("MARCADOR GLOBAL ----> Jugador1 : " + global1 + " | " + "Jugador2: " + global2);

    }

}
