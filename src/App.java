import java.util.Random;
import java.util.Scanner;

public class App {
    // inicialización del escaner
    public static Scanner sc = new Scanner(System.in);
    public static Random rng = new Random();

    // puntuaciones globales
    public static int global1 = 0;
    public static int global2 = 0;

    // puntuacion ronda

    public static double puntosJ1;
    public static double puntosJ2;

    // parametros configuración

    public static int repeticionPrueba = 1;
    public static int opcionMenu = 0;
    public static int modoJuego = 0;
    public static int modoRapido = 0;

    public static int cantidadLetras = 10;
    public static int cantidadOperacionesCalculadora = 5;

    public static int numeroInicial;

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
                    modoConcurso();
                    break;
                case 3:
                    configuracionJuego();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción Incorrecta");

            }

        } while (modoJuego != 4);

    }

    public static void configuracionJuego() {

        do {

            System.out.println("Menú de configuración , Introduzca una opción:");
            System.out.println("1.-Repetición pruebas: ");
            System.out.println("2.-Cantidad de letras: ");
            System.out.println("3.-Cantidad de operaciones: ");
            System.out.println("4.-Salir");
            opcionMenu = sc.nextInt();

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

    public static void modoConcurso() {
        cifraExacta();
        palabraMasLarga();
        calculadoraHumana();
        movilViejo();

        System.out.println("MARCADOR GLOBAL ----> Jugador1 : " + global1 + " | " + "Jugador2: " + global2);

    }

    public static void modoRapido() {

        do {
            System.out.println("Has seleccionado MODO RÁPIDO, seleccione una prueba: ");
            System.out.println("1.-Cifra exacta");
            System.out.println("2.-La palabra más larga");
            System.out.println("3.-La calculadora humana");
            System.out.println("4.-Prueba original");
            System.out.println("5.-Salir");
            modoRapido = sc.nextInt();

            switch (modoRapido) {

                case 1:
                    cifraExacta();
                    break;

                case 2:
                    palabraMasLarga();
                    break;

                case 3:
                    calculadoraHumana();
                    break;

                case 4:
                    movilViejo();
                    break;

                default:
                    System.out.println("Saliste del modo rápido");
            }

        } while (modoRapido != 5);

    }

    //Seccion La Cifra Exacta

    public static void cifraExacta() {
        int objetivo = rng.nextInt(100, 999);
        int aux1 = rng.nextInt(10) + 1;
        int aux2 = rng.nextInt(10) + 1;
        int aux3 = rng.nextInt(10) + 1;
        int aux4 = rng.nextInt(10) + 1;
        int aux5 = rng.nextInt(10) + 1;
        int aux6 = rng.nextInt(10) + 1;
        System.out.println("El objetivo es: " + objetivo);
        System.out.println("Turno de jugador 1");
        double auxE1 = elegirAux(aux1, aux2, aux3, aux4, aux5, aux6);
        double auxE2 = elegirAux(aux1, aux2, aux3, aux4, aux5, aux6);
        puntosJ1 = rondaCifraE(auxE1, auxE2, objetivo, aux1, aux2, aux3, aux4, aux5, aux6);
        System.out.println("Turno de jugador 2");
        auxE1 = elegirAux(aux1, aux2, aux3, aux4, aux5, aux6);
        auxE2 = elegirAux(aux1, aux2, aux3, aux4, aux5, aux6);
        puntosJ2 = rondaCifraE(auxE1, auxE2, objetivo, aux1, aux2, aux3, aux4, aux5, aux6);
        ganador();
    }

    public static double rondaCifraE(double auxE1, double auxE2, int objetivo, int aux1, int aux2, int aux3, int aux4, int aux5, int aux6){
        double resultado = 0; 
        for (int i = 0; i < 5; i++) {
            System.out.println("Operación " + (i + 1) + " de 5");
            System.out.println("1: Suma");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicación");
            System.out.println("4: División");
            int operacion = sc.nextInt();
            switch (operacion) {
                case 1:
                    resultado = auxE1 + auxE2;
                    break;
                case 2:
                    resultado = auxE1 - auxE2;
                    break;
                case 3:
                    resultado = auxE1 * auxE2;
                    break;
                case 4:
                    resultado = auxE1 / auxE2;
                    break;
                default:
                    System.out.println("Esa opcion no vale");
                    break;
            }
            auxE1 = resultado;
            System.out.println("El resultado es: " + resultado);
              if (i < 4) {
            auxE2 = elegirAux(
                aux1, aux2, aux3, aux4, aux5, aux6);
            }
        }
        return Math.abs(objetivo - resultado);
    };

    

    public static double elegirAux(int aux1, int aux2, int aux3, int aux4, int aux5, int aux6){
        System.out.println("los números auxiliarres son: " + "1) " + aux1 + " 2) " + aux2 + " 3) " + aux3 + " 4) " + aux4 + " 5) " + aux5 + " 6) " + aux6);
        System.out.println("Jugador introduzca el número auxiliar: ");
        int auxiliarJ = sc.nextInt();
        switch (auxiliarJ) {
            case 1:
                auxiliarJ = aux1;
                break;
            case 2:
                auxiliarJ = aux2;
                break;
            case 3:
                auxiliarJ = aux3;
                break;
            case 4:
                auxiliarJ = aux4;
                break;
            case 5:
                auxiliarJ = aux5;
                break;
            case 6:
                auxiliarJ = aux6;
                break;
            default:
                System.out.println("Ese número no es un auxiliar");
        }
        return auxiliarJ;
    }

    public static void ganador(){
        if (puntosJ1 < puntosJ2) {
            System.out.println("Gana el jugador 1");
            global1++;
        } else if (puntosJ2 < puntosJ1) {
            System.out.println("Gana el jugador 2");
            global2++;
        } else {
            System.out.println("Empate");
        }
    }

    public static void palabraMasLarga() {

        String cantidadLetras = "";

        String palabraJ1;
        String palabraJ2;

        boolean esValidaJ1 = false;
        boolean esValidaJ2 = false;
        String comprobar;

        boolean puedeFormarseJ1 = true;
        boolean puedeFormarseJ2 = true;
    

        for (int j = 0; j < repeticionPrueba; j++) {

            // Generar letras
            String letrasAleatorias = generarLetras();

            // se imprimen las vocales y consonantes recogiendolas con un bucle for
            imprimirLetras(letrasAleatorias);

            // se pide al usuario que introduzca las palabras de cada jugador
            System.out.println("Introduce la palabra del jugador 1: ");
            palabraJ1 = sc.next().toUpperCase();
            sc.nextLine();
            System.out.println("Introduce la palabra del jugador 2: ");
            palabraJ2 = sc.next().toUpperCase();
            sc.nextLine();

            // DICCIONARIO JUGADOR 1
            System.out.println("Jugador 2, ¿la palabra del Jugador 1 está en el diccionario?: (S/N)");
            comprobar = sc.next().toUpperCase();
            sc.nextLine();
            if (comprobar.equalsIgnoreCase("S")) {
                esValidaJ1 = true;
            } else if (comprobar.equalsIgnoreCase("N")) {
                esValidaJ1 = false;
            }

            // DICCIONARIO JUGADOR 2
            System.out.println("Jugador 1, ¿la palabra del Jugador 2 está en el diccionario?: (S/N)");
            comprobar = sc.next().toUpperCase();
            sc.nextLine();
            if (comprobar.equalsIgnoreCase("S")) {
                esValidaJ2 = true;
            } else if (comprobar.equalsIgnoreCase("N")) {
                esValidaJ2 = false;
            }

            // Validacion jugador

            puedeFormarseJ1 = validacionJugador(palabraJ1, cantidadLetras);
            puedeFormarseJ2 = validacionJugador(palabraJ2, cantidadLetras);

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
    }

    /**
     * Función para validar jugador recibe dos variables String y devuelve true en
     * caso de que las letras
     * sean válidas
     * 
     * @param palabra
     * @param letra
     * @return
     */

    public static boolean validacionJugador(String palabra, String letra) {

        String aux = letra;

        for (int i = 0; i < palabra.length(); i++) {

            char letraActual = palabra.charAt(i);
            int indice = aux.indexOf(letraActual); // se busca la posicion en la que esta la letra

            if (indice == -1) {
                return false;
            } else {
                aux = aux.substring(0, indice) + aux.substring(indice + 1); // se elimina la letra usada
            }

        }

        return true;
    }

    // funcion que genera letras aleatorias
    public static String generarLetras() {

        String cantidadLetras = "";
        String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        int vocales = 0;
        int consonantes = 0;
        int total = 0;

        while (total < 10) {
            int indice = rng.nextInt(abc.length());// Seleccion de letra
            char letra = abc.charAt(indice);
            boolean vocal = (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U');

            if (vocal) {
                if (vocales < 6) {
                    cantidadLetras += letra;
                    vocales++;
                    total++;
                }
            } else {
                if (consonantes < 6) {
                    cantidadLetras += letra;
                    consonantes++;
                    total++;
                }
            }
        }
        return cantidadLetras;

    }

    // funcion que imprime las letras recibiendo un String
    public static void imprimirLetras(String letras) {

        int vocales = 0;
        int consontantes;

        for (int i = 0; i < letras.length(); i++) {
            char l = letras.charAt(i);
            System.out.println(l + " ");

            if (l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == '8') {

                vocales++;
            }

        }

        consontantes = letras.length() - vocales;

        System.out.println();
        System.out.println("Vocales " + vocales + " | Consonantes " + consontantes);

    }

    // FUNCION CALCULADORA HUMANA
    public static void calculadoraHumana() {

        long tiempoInicio = System.currentTimeMillis();
        long tiempoFinal;
        int segundosPenalizacion = 0;
        int segundosTotales;
        int tiempoFinalPenalizacion;
       

        int resultado = 0;
        int respuestaJugador;

        for (int j = 0; j < repeticionPrueba; j++) {

            for (int jugador = 1; jugador <= 2; jugador++) {

                System.out.println("---TURNO JUGADOR " + jugador + "---");
                sc.nextLine();

               numeroInicial=rng.nextInt(1, 100);

                 for (int i = 0; i < cantidadOperacionesCalculadora; i++) {
                    resultado=operacionAleatoria(); 
                    System.out.println("Cual es el resultado?");
                    respuestaJugador = Integer.parseInt(sc.nextLine());

                    if (respuestaJugador == resultado) {
                        System.out.println("Respuesta correcta ");
                    } else {
                        segundosPenalizacion = segundosPenalizacion + 20;
                    }
                    numeroInicial = resultado;

                }
                tiempoFinal = System.currentTimeMillis();
                segundosTotales = (int) ((tiempoFinal - tiempoInicio) / 1000);
                tiempoFinalPenalizacion = segundosTotales + segundosPenalizacion;

                System.out.println("segundos que tardo en contestar el jugador: " + segundosTotales + " segundos");
                System.out.println("Tiempo de la ronda : " + tiempoFinalPenalizacion + " segundos ");

                if (jugador == 1) {
                    puntosJ1 = tiempoFinalPenalizacion;

                } else {
                    puntosJ2 = tiempoFinalPenalizacion;
                }

            }
            System.out.println("RESULTADO");

            if (puntosJ1 < puntosJ2) {
                global1++;
                System.out.println("Jugador 1 gana");
                System.out.println("El jugador 1 suma 1 punto en el marcador global");
            } else if (puntosJ2 < puntosJ1) {
                global2++;
                System.out.println("Jugador 2 gana");
                System.out.println("El jugador 2 suma 1 punto en el marcador global");
            } else {
                System.out.println("EMPATE. ningún jugador suma puntos");
            }
       }
    }

    public static int operacionAleatoria(){

        int  operacionAleatoria = rng.nextInt(4);
        int numeroAleatorio=0;
        int resultado=0;
        char signo=' ';
        switch (operacionAleatoria) {
            case 0:
                signo = '+';
                numeroAleatorio = rng.nextInt(90) + 10;
                resultado = numeroInicial + numeroAleatorio;
                break;
            case 1:
                signo = '-';
                numeroAleatorio = rng.nextInt(90) + 10;
                resultado = numeroInicial - numeroAleatorio;
                break;
            case 2:
                signo = '*';
                numeroAleatorio = rng.nextInt(9) + 1;
                resultado = numeroInicial * numeroAleatorio;
                break;
            case 3:
                signo = '/';
                numeroAleatorio = rng.nextInt(9) + 1;
                numeroInicial = numeroInicial * numeroAleatorio;
                resultado = numeroInicial / numeroAleatorio;
                break;
        }    
        System.out.println("Número inicial: " + numeroInicial + "" + signo + "" + numeroAleatorio);   
        return resultado;

    }

    // PRUEBA ORIGINAL

    public static void movilViejo() {

        int numeroMovil;
        int numeroPulsaciones;
        //int indice = 0;
        

        for (int i = 0; i <= repeticionPrueba; i++) {

            String palabra = "";
            String codigo = "";

            for (int j = 0; j < 5; j++) { // bucle for para generar 5 letras

                numeroMovil = rng.nextInt(9) + 1;// numero aleatorio entre el 1 y el 9
                numeroPulsaciones = rng.nextInt(3) + 1;// genera pulsaciones del 0 al 2
                codigo = codigo + numeroMovil + numeroPulsaciones + " "; // la variable guarda el numero aleatorio de la tecla del movil y las veces que se pulsan de forma aleatoria
                palabra = palabra + definirLetra(numeroMovil, numeroPulsaciones); // acumulacion de las letras para generar una palabra
            }            
            sc.nextLine();
            System.out.println("Ronda " + (i + 1) + " El codigo numerico es : " + codigo);
            System.out.println(" Jugador 1 adivina la palabra: ");
            String respuestaJ1 = sc.nextLine();
            if (respuestaJ1.equalsIgnoreCase(palabra)) {
                System.out.println("En efecto, la palabra es: " + palabra);
                puntosJ1++;
            } else{
                System.out.println("Que pena, esa no era la palabra");
            }
            System.out.println("");
            System.out.println("Ronda " + (i + 1) + " El codigo numerico es : " + codigo);
            System.out.println(" Jugador 2 adivina la palabra: ");
            String respuestaJ2 = sc.nextLine();
            if (respuestaJ2.equalsIgnoreCase(palabra)) {
                puntosJ2++;
            } else{
                System.out.println("Que pena, esa no era la palabra");
            }
            System.out.println("La palabra real era " + palabra);

        }

        if (puntosJ1 > puntosJ2) {
            System.out.println("Gana el Jugador1");
            global1++;
        } else if (puntosJ2 > puntosJ1) {
            System.out.println("Gana el Jugador2");
            global2++;
        } else {
            System.out.println("EMPATE");
        }
    }

    public static String definirLetra(int numeroMovil, int numeroPulsaciones){
        String trio = "";
        String pulsacion = "";
        switch (numeroMovil) {
            case 1:
                trio = "ABC";
                break;
            case 2:
                trio = "DEF";
                break;
            case 3:
                trio = "GHI";
                break;
            case 4:
                trio = "JKL";
                break;
            case 5:
                trio = "MNÑ";
                break;
            case 6:
                trio = "OPQ";
                break;
            case 7:
                trio = "RST";
                break;
            case 8:
                trio = "UVW";
                break;
            case 9:
                trio = "XYZ";
                break;
            default:
                break;
        }
        pulsacion = String.valueOf(trio.charAt(numeroPulsaciones - 1));
        return pulsacion;
    }

}


