# TaskTerminal-v1
TaskTerminal es una aplicación de gestión de tareas que escala a web.

¿De qué trata?
Permite agregar, cambiar el estado, eliminar tareas y salir.

Tecnologías:
Java 21 | Apache NetBeans IDE 29 | POO | Clean Code | SOLID | MVC

Modelo:
- Tarea: representa una tarea con id, descripción y estado
- AlmacenTareas: almacena y gestiona las tareas en memoria
- Estado: enum con valores PENDIENTE y COMPLETADO

Controlador:
- Gestion: intermediario entre modelo y vista

Vista:
- EjecutorVistaConsolaTask: interfaz de consola con validaciones