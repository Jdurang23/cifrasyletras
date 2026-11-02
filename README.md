# DESCRIPCIÓN DEL PROYECTO

Este proyecto Java llamado Cifras y Letras consta de varios menús con distintas opciones que llaman a las funciones .
El primero de ellos se encarga de dar la opción al usuario de seleccionar un modo de juego , entrar en la configuración del 
juego y salir. El programa cuenta también con variables globales las cuales se usan para controlar los parámetros de configuración y llevar
el recuento de las puntuaciones globales de cada jugador.

## Funcionamiento menús 

- Dentro de la opción modo rápido se abre otro menú el cual da la opción de elegir las pruebas disponibles recogidas en distintas funciones
- La opcion concurso permite jugar todas las pruebas en un orden concreto llamando a la funcion modoConcurso()
- La opción de configuración despliega otro menú que  permite elegir las repeticiones de las pruebas , número de letras y cantidad de operaciones

## Funciones del programa

 Este proyecto cuenta con varias funciones para cada prueba. Dichos métodos están separadas en lógicos(donde se programa la parte algorítmica)
 y en funciones de interfaz(donde se piden datos al usuario). 

>La cifra exacta
  
   La prueba se divide en tres funciones. La primera es elegirAux() recibe como parametro varias variables auxiliares y pide por teclado una variable.
   Esta variable se iguala a las distintas variables recogidas segun la opcion del switch. Al final devuelve el parametro . En la segunda función
   rodaCifraE() recibe como parametro las variables auxiliares de la anterior funcion , dos variables auxiliares más y una objetivo. La función tiene un 
   bucle for que itera 5 veces y cuenta con un switch para elegir las distintas operaciones aritmeticas. Devuelve el valor de la diferencia entre el resultado y el número objetivo. La ultima función se encarga de generar numeros aleatorios y llamar a las anteriores funciones.
   
>La palabra más larga
   
   En esta prueba tenemos una función que se encarga de generar las letras del abecedario , otra función booleana que valida al jugador localizando
   la posición de la letra en la palabra devolviendo true o false si la encuentra o no .La última función lógica recibe un string e imprime las vocales y las consonantes. La función principal se encarga de pedir datos al usuario por teclado y comprobar si existen las palabras introducidas 

>Calculadora humana

   Este modo de juego cuenta con dos funciones. La primera , se encarga de generar una operación aleatoria con números aleatorios mediante un switch 
   y devuelve el resultado. La otra se encarga de comparar el resultado con aquel introducido por el usuario en el teclado así como calcular el tiempo
   que tarda cada jugador en realizar la prueba y asignarle tiempo de penalización

>Prueba original (Movil viejo)

   La prueba original la hemos llamado movil viejo y consiste en generar un grupo de 5 numeros de dos dígitos aleatorios. El primer digito del grupo
   corresponde al número de la tecla de un móvil y el segundo al número de pulsaciones para localizar la letra. La idea es mostrar estos números por 
   pantalla , estos , representan una palabra que puede no tener sentido , y el jugador ha de intentar adivinar esa palabra para ganar el punto .

   El primer método int recibe como parámetro el numeroMovil y numeroPulsaciones y genera grupos de cinco palabras siguiendo la metodología del teclado
   numérico de los móviles antiguos mediante un switch y devuelve las pulsaciones. En el método principal se usa un bulce for para generar el bloque
   de dos números aleatorios y llamar al primer método para recoger las letras  .Se pide al usuario que compruebe si su palabra es igual a las generadas
   aleatoriamente




