# TALLER 1: DISEÑO Y ESTRUCTURACIÓN DE APLICACIONES DISTRIBUIDAS EN INTERNET

**Estudiante:** Edwar Fabian Lozano Florez  
**Clase:** AREP  
**Profesor:** Luis Daniel Benavides

## Funcionamiento
En este proyecto se realiza un servidor web que nos permite realizar búsquedas locales a los archivos y mostrar que tipo 
de archivo es, la conexión de este se realizó por medio de sockets (Cliente y Servidor).

## USO
Para que el proyecto se pueda usar se debe:
1. Clonación del repositorio, haciendo uso del comando:
```
   git clone https://github.com/EdwarLozano/Taller2_AREP.git
```
2. Ejecución de la aplicación, sobre la carpeta donde se encuentran los archivos haciendo uso del comando:
```
   mvn clean package exec:java -D "exec.mainClass"="edu.eci.arep.HttpServer"
```
3. Acceder al enlace: http://localhost:35000 esto desde el navegador de preferencia

4. Para acceder a la información únicamente debe realizarse la búsqueda en el espacio de texto.

