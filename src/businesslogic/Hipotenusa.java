/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businesslogic;

//Esta es la capa de logica de negocio.



/**
 *
 * @author 17
 */
public class Hipotenusa {
    
    private double lado1;
    private double lado2;
    private double suma;
    
    public double calcularHP() {
        this.suma = Math.pow(this.lado1, 2) + Math.pow(this.lado2, 2);                
        return(this.suma);
    }

    /**
     * @return the lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return the suma
     */
    public double getSuma() {
        return suma;
    }

    /**
     * @param suma the suma to set
     */
    public void setSuma(double suma) {
        this.suma = suma;
    }
    
    
    
}
