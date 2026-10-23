import java.util.Random;
import java.util.Scanner;

public class App {
    // inicialización del escaner
    public static Scanner sc = new Scanner(System.in);
    public static Random rng = new Random();
    // puntuaciones globales jugadores

    public static int puntosGlobalesJ1 = 0;
    public static int puntosGlobalesJ2 = 0;

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
            modoJuego = Integer.parseInt(sc.nextLine());

            switch (modoJuego) {

                case 1:
                        modoRapido();
                        
                    break;

                case 2:
                       // modoConcurso();
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
                      //palabraMasLarga();
                    break;

                case 3:
                     
                    break;

                case 4:

                    break;

                default:System.out.println("Saliste del modo rápido");

            }

        } while (modoRapido != 5);

    }

    
    

    public static void concurso() {


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
