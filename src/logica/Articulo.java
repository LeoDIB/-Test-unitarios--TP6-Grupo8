/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author EXO
 */
public class Articulo {
    String nombreArticulo = "";
    Integer cantidadStockArt;
    String codigoArticulo="";
    
    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public Integer getCantidadStockArt() {
        return cantidadStockArt;
    }

    public void setCantidadStockArt(Integer cantidadStockArt) {
        this.cantidadStockArt = cantidadStockArt;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }
    
     @Override
    public String toString() {
        return "Articulo{" + "nombreArticulo =" + nombreArticulo + ", cantidadStockArt=" + cantidadStockArt + ", codigoArticulo=" + codigoArticulo + '}';
    }
    
}
