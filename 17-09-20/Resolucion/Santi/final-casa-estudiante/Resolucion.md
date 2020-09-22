# Resolucion

## Consigna 1

### Problemas de diseño
    
    * Hay codigo repetido entre el Auto y la Moto a la hora descargar y cargar.
    Esto representa un problema de diseño ya que a la hora de agregar un tercer 
    vehiculo existe el potencial problema de que esto vualva a repetirse.
    
    * Al tratar de cargar una bici en un Auto se lanza una excepcion generica
    que no provee ningun tipo de contexto a porque fue lanzada dificultando
    su lectura.
    
    * No lanzar una excepcion mas definida al tratar de descargar cuando no se 
    ha cargado nada hace que se permee la implementacion de como se implemento
    el sistema de cargas en un vehiculo haciendo que en definitiva un usuario
    deba depender de algo volatil como es la implementacion del vehiculo.
    
### Principios violados

    * Se viola el principio de inversion de la dependencia ya que el auto y la moto 
    dependen de una clase muy volatil como es la implementacion de las Cargas.
    
    * Se viola el Open-Close ya que si el dia de mañana uno quisiera que el vehiculo
    no acepte un nuevo tipo de de carga se deberia modificar al vehiculo en si.
    
    
    