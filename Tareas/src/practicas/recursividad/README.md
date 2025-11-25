## Ejercicio 1

*Descripción*

Se desea sumar un arreglo de números


*Instrucciones*

*Iterativo*: se declara una variable auxiliar la cual contendrá la suma total de los valores, luego se aplica un recorrido sobre el arreglo dado mediante un for. Dentro de este bucle se guarda en la variable auxiliar la sumatoria de los valores del arreglo obtenidos mediante el índice.

*Recursivo*: Se declara como caso base la condición de que se siga llamando la función hasta que el valor del índice sea 0. En dado caso de que sea diferente a 0 se vuelve a llamar la función de forma recursiva, pero se le suma el valor del arreglo con el índice actual, además de sumarle uno al índice de la función con objetivo de que se siga recorriendo el arreglo.


*Ejemplos de entrada y salida*

Entrada = {1,2,3,4,5}
Salida = 15

*Ingrese el numero de datos:* 5

*Ingrese cada dato separado por un espacio:*
5 4 8 8 2

*El valor de la suma iterativa es:* 27

*El valor de la suma recursiva es:* 27


Complejidad

Temporal = 0(N)

Complejidad = 0(N)

## Ejercicio 2

### Descripción:

Este programa tiene como función devolverte el valor de maximo de un arreglo de números

### Instrucciones

*Iterativo:* Se declara una variable auxiliar maximo y se realiza un for sobre el arreglo el cual contiene una condición dentro de él que solo se cumple si el valor del arreglo que se encuentra en el índice actual es mayor que nuestra variable auxiliar.
Si esto se cumple, pues la variable maximo pasa a obtener el valor de que tenía el arreglo en dicho índice Esto se realizará hasta que se acabe el arreglo.

*Recursivo:* El programa utiliza tres datos: un *arreglo de números* y dos variables de tipo int, donde la primera corresponde al índice inicial del arreglo y la segunda al tamaño del arreglo -1

Se comienza evaluando el caso base, el cual solo se ejecuta
si las dos variables auxiliares son iguales
Esta forma se caracteriza por dividir el arreglo en dos partes: *izquierda* y *derecha*, la cual llaman nuevamente a la función de forma recursiva y utilizar una variable llamado medio para poder recorrer el arreglo más fácil
.

### *Ejemplo de entrada y salida*

Ingrese el numero de datos:
3
Arreglo aleatorio generado:
17370 96775 39896
El maximo iterativo es: 96775
El maximo recursivo es: 96775

### *Complejidad*

Iterativo: 0(n)

Recursivo: 0(n)

*a. Por qué el enfoque divide y vencerás es más natural de forma recursiva*

Debido a que se acorta el número de operaciones


*b. Qué sucede con la complejidad espacial al pasar de O(log n) a O(1)*

Significa que el algoritmo usa mucha menos memoria.
La versión recursiva necesita O(log n) por las llamadas en la pila, mientras que la iterativa solo usa O(1) variables.
Esto hace que el algoritmo sea más eficiente y evita problemas como StackOverflow.

## Ejercicio 3
### Descripción
El problema pide crear un algoritmo que invierta un string o
cadena de manera iterativa y recursiva.
### Instrucciones
Iterativo: Un algoritmo sencillo donde se recorre la cadena
desde el último elemento hasta el primero, se usa un 
StringBuilder para ir creando una cadena invertida.

Recursivo: Parecido a una suma recursiva, la funcion 
recibe la cadena y el índice en cada llamada. Se comienza 
con el último índice de la cadena y se va llamando 
recursivamente con el proximo elemento que sería i - 1, o sea
el actual menos uno, reduciendose asi hasta que llegue
al primer elemento de la cadena. 

El caso base es cuando el índice sea 0, para indicar que
es el primer elemento de la cadena y no hay que llamar 
recursivamente más, este caso simplemente retorna el
elemento inicial.

### Ejemplos

Entrada = aguacate \
Salida = etacauga
\
\
Entrada = otorrinolaringologo \
Salida = ogologniralonirroto \
\
Ejemplo con terminal: \
Introduzca la cadena a invertir: \
abcdefghijklmnopqrstuvwxyz \
Cadena invertida iterativa: \
zyxwvutsrqponmlkjihgfedcba \
Cadena invertida recursiva: \
zyxwvutsrqponmlkjihgfedcba 
### Analisis de complejidad
Complejidad temporal del iterativo: O(n) \
Complejidad temporal del recursivo: O(n) 
