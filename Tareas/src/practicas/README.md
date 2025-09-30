# Practica 2
## Shift de Arreglo
### Funcion shift
Complejidad de tiempo: O(n^2) \
Usa ArrayList. Divide las cantidad de veces que tiene
que rotarse cada mitad, despues llama a la funcion rotar,
que rota el subarreglo 1 vez, sigue llamando para cada mitad
hasta que complete las cantidades de rotaciones necesitarias.

### Funcion shift2
Complejidad de tiempo: O(n)
Usa arreglo de string primitivo. De misma manera divide
las rotaciones para cada mitad.
Llama la función rotar2, la cual volteara el subarreglo 3 
veces, primero voltea el subarreglo entero. Despues voltea
la cantidad de elementos igual a las rotaciones. Finalmente,
voltea los elementos restantes. 
Una forma eficiente de resolver este algoritmo.


## MergeSort de Estudiantes
Complejidad de tiempo: O(n log n)
Complejidad espacial: O(n)