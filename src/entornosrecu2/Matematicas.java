/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;


public class Matematicas {

    private int numero;

    public Matematicas(int numIn) {
        chequearNum(numIn);
    }

    /*He seleccionado el codigo, he dado a Refactor --> Introduce --> Method. Luego he seleccionado el nombre*/
    public void chequearNum(int numIn) {
        if ((numIn > 999) || (numIn < 1)) {
            this.numero = 1;
            System.out.println("Número inválido. Se establece 1");
        } else {
            this.numero = numIn;
        }
    }

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
    
    public double factorial() {
        double result = 1;
        for (int i = 1; i < this.numero; i++) {
            result = result * i;
        }
        return result;
    }

    public int multiplicar(int num2){
        return (this.numero * num2);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
