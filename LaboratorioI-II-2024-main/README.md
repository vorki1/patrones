
# Laboratorio I-2024
## <sup>Asignatura: Patrones de Software y Programación </sup> <br><sup>Profesor: Daniel San Martín</sup> <br> <sup> Nombre Estudiante:</sup>
<hr>
Dado el enunciado a continuación, implemente el patrón de diseño que usted considere necesario
para dar solución al requerimiento. Además, explique porqué escogió el patrón, cual es su característica
donde se clasifica el patrón y porqué da solución a la problemática.
<hr>

# Enunciado

Una empresa de desarrollo de software ha sido contratada para implementar una 
solución que gestione el acceso a una biblioteca digital de recursos multimedia y sus
usuarios. La bilioteca incluye imágenes, vídeos y documentos donde algunos podrían encontrarse protegidos.

El sistema debe permitir buscar usuarios en distintas fuentes de datos. Además, se debe controlar 
el acceso a los archivos multimedia que están protegidos. Solo usuarios con los permisos adecuados deben 
poder abrir y visualizar los archivos protegidos.

Su tarea es diseñar una solución que permita lo siguiente:

 * Buscar un usuario en la base de datos, si este no existe, el sistema debe buscar 
en el archivo *externo.csv* de manera transparente. La clase *Util* contiene el método para 
buscar usuarios en archivos csv.
 * Controlar el acceso a los archivos protegidos para asegurar que solo usuarios con 
permisos válidos puedan visualizarlos. El sistema debe mostrar mensajes que indicando si existen 
los permisos o no, de acuerdo al archivo asignado por defecto.

## Guías

1. Utilize el paquete interfaz para implementar las interfaces que estime conveniente.
2. Puede modificar todo el código para lograr su propósito si estima conveniente. 

<hr>

## Explicación
(Escriba aquí su explicación)

La asignacion del patron strategy ha sido el que se ha definido en la resolucion de este problema.
Según el enunciado se utilizaba una estrategia para buscar en la base de datos a los usuarios y en caso
de que no exista, la estrategia de busqueda debia cambiar a una busqueda en una base de datos csv.
Por lo que la idea de implementar un patron strategy ha sido pertinente a la solución del problema.

El patron que se podria usar y que no implementare por razones de tiempo seria el patron Decorator,
ya que este patron permitiria asignarle un acceso a recursos protegidos en caso de tener permiso, por lo que
seria una buena opción la implementacion del patron Decorator.
<hr>
