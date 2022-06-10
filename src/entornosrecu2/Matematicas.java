/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;

/**
 * 
 * @author Ronal Arrayaza Gonzales
 * @version VExamen3
 * @see <a href="EntornosRecu2.html">Vea Tambien la clase principal Clase Principal</a>
 */
public class Matematicas {
    /**
     * Variable numero 
     */
    private int numero;
    /**
     * Metodo Constructor con un parametro de entrada
     * @param numIn 
     */
    public Matematicas(int numIn) {
        chequearNum(numIn);
    }
    /**
     * Metodo chequearNum se crea con  refactor - Introduce  - Method desde el constructor
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
     * Metedo que verifica si un numero es capicua
     * @return devuelve falso o verdadero de acuerdo al numero enviado en el contructor
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
     * Metodo que obtiene el factorial del numero 
     * @return Devuelve la acumulacion multiplicada
     */
    public double factorial() {
        double result = 1;
        for (int i = 1; i < this.numero; i++) {
            result = result * i;
        }
        return result;
    }
    /**
     * Metodo que multiplica un numero introducido por parametro
     * @param num2 numero para multiplica
     * @return devuelve la mutiplicacion del numero almacenado en el objeto con el parametro
     */
    public int multiplicar(int num2){
        return (this.numero * num2);
    }
    /**
     * 
     * @return devuelve el numero 
     */
    public int getNumero() {
        return numero;
    }
    /**
     * 
     * @param numero numero que sea asigna al nuevo numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
