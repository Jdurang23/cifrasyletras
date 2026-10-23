import java.util.Random;
import java.util.Scanner;

public class App {
    // inicialización del escaner
    public static Scanner sc = new Scanner(System.in);
    public static Random rng = new Random();

    // puntuaciones globales
    public static int global1 = 0;
    public static int global2 = 0;

    //puntuacion ronda

    public static int puntosJ1;
    public static int puntosJ2;
    
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



   public static void palabraMasLarga() {


        String letrasTotales = "";
        int vocales = 0;
        int consonantes = 0;
        int total = 0;

        String palabraJ1;
        String palabraJ2;

        boolean esValidaJ1 = false;
        boolean esValidaJ2 = false;
        String comprobar;

        boolean puedeFormarseJ1 = true;
        boolean puedeFormarseJ2 = true;
        String aux1;
        String aux2;

        // Generar letras
        while (total < 10) {
            char letra = (char) (rng.nextInt(26) + 'A');
            boolean vocal = (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U');

            if (!vocal) {
                if (vocales < 6) {
                    letrasTotales += letra;
                    vocales++;
                    total++;
                }
            } else {
                if (consonantes < 6) {
                    letrasTotales += letra;
                    consonantes++;
                    total++;
                }
            }
        }

        // se imprimen las letras generadas recogiendolas con un bucle for

        for (int i = 0; i < letrasTotales.length(); i++) {

            System.out.print(letrasTotales.charAt(i) + " ");

        }

        // se imprime las vocales y las consonantes
        System.out.println();
        System.out.println("Vocales: " + vocales + " | Consonantes: " + consonantes);

        // se pide al usuario que introduzca las palabras de cada jugador
        System.out.println("Introduce la palabra del jugador 1: ");
        palabraJ1 = sc.nextLine().toUpperCase();
        System.out.println("Introduce la palabra del jugador 2: ");
        palabraJ2 = sc.nextLine().toUpperCase();

        // DICCIONARIO JUGADOR 1
        System.out.println("Jugador 2, ¿la palabra del Jugador 1 está en el diccionario?: (S/N)");
        comprobar = sc.nextLine();
        if (comprobar.equalsIgnoreCase("S")) {
            esValidaJ1 = true;
        } else if (comprobar.equalsIgnoreCase("N")) {
            esValidaJ1 = false;
        }

        // DICCIONARIO JUGADOR 2
        System.out.println("Jugador 1, ¿la palabra del Jugador 2 está en el diccionario?: (S/N)");
        comprobar = sc.nextLine();
        if (comprobar.equalsIgnoreCase("S")) {
            esValidaJ2 = true;
        } else if (comprobar.equalsIgnoreCase("N")) {
            esValidaJ2 = false;
        }

        // Validacion Jugador 1
        aux1 = letrasTotales;
        for (int i = 0; i < palabraJ1.length(); i++) {

            char letraActual = palabraJ1.charAt(i);
            int indice = aux1.indexOf(letraActual);// buscamos la posicion en la que esta la letra

            if (indice == -1) {
                puedeFormarseJ1 = false;
                break;
            } else {
                aux1 = aux1.substring(0, indice) + aux1.substring(indice + 1);// eliminamos
            }
        }

        // Validacion Jugador 2
        aux2 = letrasTotales;
        for (int i = 0; i < palabraJ2.length(); i++) {

            char letraActual = palabraJ2.charAt(i);
            int indice = aux2.indexOf(letraActual);

            if (indice == -1) {
                puedeFormarseJ2 = false;
                break;
            } else {
                aux2 = aux2.substring(0, indice) + aux2.substring(indice + 1);
            }
        }

        // Conteo de puntos

        if (esValidaJ1 && puedeFormarseJ1) {

            puntosJ1 = palabraJ1.length();
        }

        if (esValidaJ2 && puedeFormarseJ2) {

            puntosJ2 = palabraJ2.length();
        }

        // mostramos las palabras de cada jugador
        System.out.println("Palabra jugador 1: " + palabraJ1);
        System.out.println("Palabra jugador 2: " + palabraJ2);

        // resultado
        System.out.println("---RESULTADO---");
        if (puntosJ1 > puntosJ2) {
            global1++;
            System.out.println("Gana el jugador 1");
            System.out.println("El jugador 1 suma 1 punto en el marcador global");

        } else if (puntosJ2 > puntosJ1) {
            global2++;
            System.out.println("Gana el jugador 2");
            System.out.println("El jugador 2 suma 1 punto en el marcador global");

        } else {

            System.out.println("EMPATE. ningún jugador suma puntos");
        }

    }




    
    

   public static void modoConcurso() {

        palabraMasLarga();
        //calculadoraHumana();

        System.out.println("MARCADOR GLOBAL ----> Jugador1 : " + global1 + " | " + "Jugador2: " + global2);

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
