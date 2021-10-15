/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import logica.Calculo;
import logica.Usuario;

/**
 *
 * @author leonardo dibiagi
 */
public class TestMetodos extends TestCase {

    public Usuario usuario;
    public Usuario usuario2;

    public void escenario() {

        usuario = new Usuario();

        usuario.setContraseña("asd2");

    }

    private Calculo calculo;

    public void escenario2() {

        calculo = new Calculo();

    }
//Validar que el total sea la suma de un subtotal, envío e impuestos. 
    
    //Si ingresamos los valores 3234.23, 234.21, 300; la suma total debe ser 3234.23 + 234.21 + 300.

    public void testCalcular() {
        escenario2();
        assertTrue(calculo.sumaTotales(3234.23, 234.21, 300) == (3234.23 + 234.21 + 300));

    }

    //Comprobar que la contraseña sea de tipo String. 
    
    
    public void testContraseñaString() {
        escenario();
        assertEquals("String", usuario.getContraseña().getClass().getSimpleName());

    }

    public void escenario3() {
        usuario2 = new Usuario();
        usuario2.setEmailUsuario("paulupa95@gmail.com");
        usuario2.setDniUsuario("39235486");

    }

    public void testYaExisteUsuario() {
        escenario3();
        assertEquals("paulupa95@gmail.com", usuario2.getEmailUsuario());
        
        //assertTrue("paulupa95@gmail.com", true);
    }

    public void testIngresoDNInoVacio() {
        
        //chequea a la hora de registrarse e indicar el dni, no este vacio el campo
        
        escenario3();
        assertNotNull("No es null", usuario2.getDniUsuario());

    }
}
