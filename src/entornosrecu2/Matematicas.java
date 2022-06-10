/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;
/**
 * 
 * @author Carmen Sánchez Caballero
 * @version v1.0
 * @see entornosrecu2.EntornosRecu2#main(java.lang.String[]) 
 */

public class Matematicas {
/**
 * variable que recoge el valor del número de entrada o 1
 */
    private int numero;
/**
 * 
 * @param numIn  el es numero que insertas como parámetro de entrada
 */
    public Matematicas(int numIn) {
        if ((numIn > 999) || (numIn < 1)) {
            this.numero = 1;
            System.out.println("Número inválido. Se establece 1");
        } else {
            this.numero = numIn;
        }
    }
    /**
     * 
     * @return devuelve true o false según si el número es capicua o no
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
     * En vez de tener varios if anidados, he puesto todos los valores verdaderos en un if
     * y cuando un número no sea capicúa vaya a la parte del else.
     * 
     * @param num este numero que tiene de entrada para ver si es capicua o no
     * @return  El return devuelve el valor de si el parametro de entrada es capicua
     */
    public boolean chequearNum(int num){
            if(num<10 || (num<100 && (num/100==num%10) || num<1000 && (num/100==num%10))){
                return true;
            }
            else{
                return false;
            } 
    }
    /**
     * 
     * @return devuelve el numero factorial
     */
    public double factorial() {
        double result = 1;
        for (int i = 1; i < this.numero; i++) {
            result = result * i;
        }
        return result;
    }
    /**
     * 
     * @param num2 parametro de entrada 
     * @return devuelve el valor del numero que insertas o 1 según el valor de las condiciones
     */
    public int multiplicar(int num2){
        return (this.numero * num2);
    }
/**
 * 
 * @return recoge el numero que se ha insertado
 */
    public int getNumero() {
        return numero;
    }
/**
 * setea el numero introducido al parametro numero
 * @param numero numero que se inserta
 */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
