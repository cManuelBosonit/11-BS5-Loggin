# 11-BS5-Loggin

Crear programa que escriba los logs tipo Error en un fichero y los de tipo Warning o inferiores solo a consola.
Parte opcional:
Los ficheros se deberán llamar ‘spring-logging-NN.log', donde NN es el numero consecutivo. Hacer que genere un fichero de log nuevo cada vez que se inicie la aplicación y que como máximo haya 5 ficheros. 
Por ejemplo, el primer fichero será: spring-logging.log, el segundo spring-logging-01.log, etc. 
Cada vez que se genere uno nuevo, se renombrara spring-logging.log a spring-logging-01.log,  spring-logging-01.log a spring-logging-02.log y así sucesivamente. spring-logging-05.log, si existe será borrado y spring-logging-04.log será renombrado a spring-logging-05.log
Configurar el sistema de logs para que si un fichero excede los 5K de longitud también deberá rotar.
Aclaración importante:  Habría que crear un fichero ‘logback-spring.xml” o “logback.xml”. 
