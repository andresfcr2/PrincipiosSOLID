# Proyecto SOLID — Nómina

Cada carpeta es una versión completa y ejecutable del mismo proyecto. Si alguien se atrasa o su código no compila, copia la carpeta del paso anterior y sigue desde ahí.

| Carpeta | Estado |
|---|---|
| 00-inicio | Proyecto de partida. Viola los cinco principios a propósito. |
| 01-responsabilidad-unica | GestorNomina dividido: ExportadorCSV y NotificadorCorreo. |
| 02-abierto-cerrado | Empleado abstracta, subclases por tipo, sin switch. Se agrega EmpleadoPorComision. Main trae comentado el bloque que provoca el error del paso L. |
| 03-sustitucion-liskov | Interfaz Bonificable. Practicante extiende Empleado directamente. |
| 04-segregacion-interfaces | Trabajador dividida en ConHoras, ConPrestaciones y ConVacaciones. |
| 05-inversion-dependencias | Interfaz RepositorioNomina. GestorNomina recibe el repositorio por constructor. RepositorioEnMemoria para probar. |

Las líneas que cambian en cada paso llevan un comentario que empieza con \`// Paso\`.

## Ejecutar cualquier versión
```
cd 00-inicio
javac *.java && java Main
```

## Pendiente para el reto
En 05, GestorNomina todavía crea con \`new\` el exportador y el notificador. El reto de la clase (exportar también a PDF sin modificar GestorNomina) consiste en aplicarles lo mismo que al repositorio.
