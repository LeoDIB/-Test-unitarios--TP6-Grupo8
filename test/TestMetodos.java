/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import logica.Calculo;
import logica.Usuario;
import logica.Articulo;
/**
 *
 * @author leonardo dibiagi
 */
public class TestMetodos extends TestCase {

    public Usuario usuario;
    public Usuario usuario2;
    public Usuario usuario3;
    public Articulo articulo1;
    
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
        usuario2.setEmailUsuario( "paulupa95@gmail.com");
        usuario2.setDniUsuario( "39235486");
    }

    public void testYaExisteUsuario() {
        escenario3();
        assertEquals("paulupa95@gmail.com", usuario2.getEmailUsuario());
    }

        //chequea a la hora de registrarse e indicar el dni, no este vacio el campo
    public void testIngresoDNInoVacio() {
        escenario3();
        assertNotNull("No es null", usuario2.getDniUsuario());
    }
    
    public void escenario4(){
    usuario3= new Usuario();
    usuario3.setNombreUsuario("pedro");
    usuario3.setContraseña("siempreviva1235");
    usuario3.setEdadUsuario(18);
    usuario3.setApellidoUsuario("gomez");
    }
    
    //verifica que la contraseña no sea vacia
   public void testContraseñaVacia(){
       escenario4();
       assertNotNull("Contraseña no nula", usuario3.getContraseña());
   }

    //verifica que la contraseña ingresada sea correcta
   public void testContraseñaCorrecta(){
    escenario4();
    assertEquals(usuario3.getContraseña(),"siempreviva1235");
   }
   
   //verifica que la contraseña ingresada NO es correcta
    public void testContraseñaIncorrecta(){
       escenario4();
       assertNotSame(usuario3.getContraseña(), "123456");
    }
    
    //Comprobar que  la casilla nombre no esté vacía.
    public void testUsuarioNombre(){
        escenario4();
        assertNotNull("Nombre de usuario no es vacío", usuario3.getNombreUsuario());
    }
    
    //Comprobar que la edad del comprador sea mayor o igual a 18 años
    public void testUsuarioEdad(){
        escenario4();
        assertTrue("Usuario Mayor o igual de 18 años",usuario3.getEdadUsuario() >= 18);
    }
    
    //Comprobar que el apellido del usuario no sea vacío
    public void testUsuarioApellido(){
        escenario4();
        assertNotNull("Apellido de usuario no es vacío", usuario3.getApellidoUsuario());
    }
    
    public void escenario5(){
    articulo1 = new Articulo();
    articulo1.setNombreArticulo("mesa");
    articulo1.setCantidadStockArt(2);
    articulo1.setCodigoArticulo("m000");
    }
    
    //Comprobar que exista stock del artículo seleccionado  ,el mismo sea mayor a cero
   public void testArticuloStock(){
        escenario5();
        assertTrue("Articulo con stock mayor a 0",articulo1.getCantidadStockArt() > 0);
    }
   
   //Comprobar que el código del artículo no sea vacío
    public void testArticuloCodigo(){
        escenario5();
        assertNotNull("Articulo con código no vacío",articulo1.getCodigoArticulo());
    }
}
   