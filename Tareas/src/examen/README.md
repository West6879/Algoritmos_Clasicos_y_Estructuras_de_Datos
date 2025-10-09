## Implementación de un servicio de cola
## Clases:
### PrintJob
Representa la clase objeto o dato, que se va a manejar en
la cola. \
Contiene el nombre del usuario que envio el trabajo,
la prioridad del trabajo, y la fecha que representa la
hora con mas precisión.

### PrintQueue
Esta clase representa la estructura de datos usada. \
Una cola, especificamente un PriorityQueue. \
El PriorityQueue tiene un parametro llamado Comparator, 
que permite realizar la organización de datos en la 
cola en base a condiciones simples. 
\
\
La primera condición la prioridad, usa el .comparingInt(),
al cual se le pasa un dato enum de la clase prioridad, 
se usa el .ordinal() del enum para convertir los datos
en indices, L = 0, M = 1, y H = 2, despues se usa el
.reversed() para poner la prioridad alta de primero.
\
\
Dado el caso que al comparar las prioridades sean iguales,
entonces, se usa .thenComparing() para comparar las fechas
y organizarlas de menor a mayor, osea el trabajo que fue
enviado primero.


### PrintService
Esta clase se usa para añadir y procesar los trabajos 
de la cola.
\
Tiene 3 metodos:
\
enviarTrabajo: Crea un trabajo con el nombre del usuario y
la prioridad especificada, y automaticamente asigna la fecha
actual.
\
procesarTrabajo: Este metodo procesa un trabajo a la vez/
\
procesarTrabajos: Este metodo procesa todos los trabajos
de la cola en orden hasta que quede vacia.


### PrintManager
Clase principal con el main y maneja todo lo visual en
la terminal.
\
Contiene menu con opciones para el usuario.


### Prioridad
Clase extra usada para representar la prioridad como parte
de un enum en vez de utilizar chars.




