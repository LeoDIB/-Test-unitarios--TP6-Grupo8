/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author leonardo dibiagi
 */
public class Calculo {

    double subtotal;

    double impuesto;

    int envio;

    
    public double sumaTotales(double subtotal, double impuesto, int envio){
        
        return subtotal+impuesto+envio;
    
    }
}
