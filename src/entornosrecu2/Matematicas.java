/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;

/**
 * Operaciones 
 * @version v1
 * @author admin
 * @see EntornosRecu2
 */
public class Matematicas {

    /**
     * se trata del número al que le aplicamos las funciones de la clase 
     */
    private int numero;

    public Matematicas(int numIn) {
        chequearNum(numIn);
    }
    
    /**
     * Este método ha sido creado refactorizando el código del contructor 
     * con introduce Method
     * @param numIn 
     */

    public void chequearNum(int numIn) {
        if ((numIn > 999) || (numIn < 1)) {
            this.numero = 1;
            System.out.println("Número inválido. Se establece 1");
        } else {
            this.numero = numIn;
        }
    }

    /**
     * Comprueba que un número sea capicua.Nos devuele true o false.
     * @return true o false 
     */
    public boolean capicua() {
        if (this.numero < 10) {
            return true;
        } else if (this.numero < 100) {
            if ((Math.floor(this.numero / 10)) == (this.numero % 10)) {
                return true;
            } else {
                return false;
            }
        } else if (this.numero < 1000) {
            if ((Math.floor(this.numero / 100)) == (this.numero % 10)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
    /**
     * Nos calcula el factorial del número
     * @return el factorial del numero
     */
    public double factorial() {
        
        double result = 1;
        for (int i = 1; i < this.numero; i++) {
            result = result * i;
        }
        return result;
    }
    /**
     * Nos multiplica el número por otro número que pasamos como argumento
     * @return el resultado de multiplicar nuestro número con el que le pasamos al método
     */
    public int multiplicar(int num2){
        return (this.numero * num2);
    }
     /**
     * Nos devuelve el número
     * @return numero con el que operamos
     */
    public int getNumero() {
        return numero;
    }
     /**
     * Podemos cambiar el número
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
