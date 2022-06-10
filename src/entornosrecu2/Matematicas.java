/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;

/**
 * @version 1.0
 * @author Hugo
 * @see EntornosRecu2
 */
public class Matematicas {

    private int numero;

    /**
     *
     * @param numIn
     */
    public Matematicas(int numIn) {
        chequearNum(numIn);
    }

    /**
     * Seleccionas el if else, vas a refactor, introduce Method
     * Insertas el nombre y clicas en refactor.
     * @param num 
     */
    private void chequearNum(int num) {
        if ((num > 999) || (num < 1)) {
            this.numero = 1;
            System.out.println("Número inválido. Se establece 1");
        } else {
            this.numero = num;
        }
    }

    /**
     *
     * @return
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
     *
     * @return
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
     * @param num2
     * @return
     */
    public int multiplicar(int num2){
        return (this.numero * num2);
    }

    /**
     *
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
