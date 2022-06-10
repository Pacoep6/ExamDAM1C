/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;

/**
 * @author Ian Martin
 * @version vI 1.0
 * @see EntornosRecu2
 */
public class Matematicas {

    /**
     * Atributo de la clase matematicas que recoge un valor entero
     */
    private int numero;

    /**
     * @param numIn Numero introducido como parametro que recoge el constructor
     */
    public Matematicas(int numIn) {
        chequearNum(numIn);
    }

    /**
     * @param numIn variable que recoge el numero a comprobar He seleccionado el
     * codigo que comprueba si un numero es valido o no. En el apartado de
     * refector he seleccionado la opcion "introduce" Por ultimo he seleccionado
     * la opción method indicando el nombre del nuevo metodo
     */
    private void chequearNum(int numIn) {
        if ((numIn > 999) || (numIn < 1)) {
            this.numero = 1;
            System.out.println("Número inválido. Se establece 1");
        } else {
            this.numero = numIn;
        }
    }

    /**
     * Metodo que nos permite comprobar si el numero introducido es capicua
     *
     * @return Nos devuelve un valor boolean, true o false dependiende de la
     * ejecución
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
     * Metodo que nos indica si el el numero es capicua
     *
     * @return nos devuelve el resultado de la ejecución para comprobar si
     */
    public double factorial() {
        double result = 1;
        for (int i = 1; i <= this.numero; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * @param num2 Numero introducido que se ejecutara en el metodo
     * @return decuelve el resultado de la multiplicación
     */
    public int multiplicar(int num2) {
        return (this.numero * num2);
    }

    /**
     * Metodo que nos devuelve el numero del atributo numero
     *
     * @return nos devuelve el numero contenido en el atributo numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Metodo que sirve la asignación del atributo numero de la clase
     * matematicas según el parametro pasado
     *
     * @param numero Numero que se pasa como parametro.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

}
