/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;
/**
 * 
 * @author Ronal Arrayaza Gonzales
 * @version VExamen3
 */
public class EntornosRecu2{
    /**
     * Declaracion de Variables
     */
    /**
     * Variable que define el numero de ramas
     */
    private int numRamas=3; //rellena desde el ejercicio 1!!
    /**
     * Variable que define la rama Principal
     */
    private String ramaPrincipal="main"; //rellena desde el ejercicio 1!!
    /**
     * Variable de la rama mas Evolucionada
     */
    private String ramaEvolucionada="main"; //rellena desde el ejercicio 1!!
    /**
     * Variable que almacena la Respuesta al Ejercicio 05
     */
    private String ExplicaciónEj5="Se añaden las variables numRamas, ramaPrincipal y ramaEvolucionada y se ha movido el comentario de sitio ";
    /**
     * Variable que almacena la Respuesta al ejercicio 6
     */
    private String EJ6="System.out.println(calc1.multiplicar(3))";
   
    /**
     * Metodo Principal y de Ejecucion
     * @param args Parametros de entrada para la ejecucion del main
     */
    public static void main(String[] args) {
        
        //aquí sólo hacemos ejemplos para ver que funciona bien la clase Matemáticas
        
        Matematicas calc1 = new Matematicas(11);//ejemplo
        System.out.println(calc1.capicua()); //ejemplo
        System.out.println(calc1.multiplicar(3));
        System.out.println(calc1.factorial());
        
        
           
        
        
    }
    
}
