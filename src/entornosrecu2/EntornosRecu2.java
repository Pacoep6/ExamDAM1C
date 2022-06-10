/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;
/**
 * 
 * @author Carmen Sánchez Caballero
 * @version v1.0
 */

public class EntornosRecu2 {
/**
 * Variable numRamas recoge el numero de ramas que tiene el proyecto
 * variable ramaPrincipal recoge el valor de la rama por defecto del proyecto
 * variable ramaEvolucionada recoge la rama del proyecto que está más completa
 * variable explicacionEj5 recoge la explicación que se ha realizado en el ejercico 5
 * variable explicacionEj6 recoge la explicacion que se ha realizado en el ejercicio 6
 */
    private int numRamas=3; //rellena desde el ejercicio 1!!
    private String ramaPrincipal="main"; //rellena desde el ejercicio 1!!
    private String ramaEvolucionada="ramaPaco"; //rellena desde el ejercicio 1!!
    private String explicacionEJ5="Se elimina el fichero /dev/null y se añade /b/build.xml en la revisión más antigua y en la cuarta más antigua se añaden comentarios a las variables numRamas, ramaPrincipal y ramaEvoluciona";
   private String explicacionEj6="En la línea 12 había este comentario:  //aquí sólo se han programado ejemplos. Puedes hacer los tuyos";
    public static void main(String[] args) {
        
        //aquí sólo hacemos ejemplos para ver que funciona bien la clase Matemáticas
        /**
         * el atributo calc1 es una variable de la clase Matemáticas. De ella se llamarán a los distintos métodos de la 
         * clase Matemáticas.
         */
        Matematicas calc1 = new Matematicas(11);//ejemplo
        System.out.println(calc1.capicua()); //ejemplo
        System.out.println(calc1.multiplicar(3));
        System.out.println(calc1.factorial());
        
        
           
        
        
    }
    
}
