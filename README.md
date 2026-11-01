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

 Este proyecto cuenta con varias funciones para cada prueba. Dichas funciones están separadas en funciones lógicas(donde se programa la parte algorítmica)
 y en funciones de interfaz(donde se piden datos al usuario). 

>La cifra exacta
  
   La prueba se divide en tres funciones. La primera es elegirAux() recibe como parametro varias variables auxiliares y pide por teclado una variable.
   Esta variable se iguala a las distintas variables recogidas segun la opcion del switch. Al final devuelve el parametro . En la segunda función
   rodaCifraE() recibe como parametro las variables auxiliares de la anterior funcion , dos variables auxiliares más y una objetivo. La función tiene un 
   bucle for que itera 5 veces y cuenta con un switch para elegir las distintas operaciones aritmeticas. Devuelve el valor de la diferencia entre el resultado y el número objetivo. La ultima función se encarga de generar numeros aleatorios y llamar a las anteriores funciones.
   





