/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cesarino1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


/**
 *
 * @author Francesco
 */
public class TriangoloTest {
    
    public TriangoloTest() {
    }

    /**
     * Test of calcolaPerimetro method, of class Triangolo.
     */
    @Test
    public void testCalcolaPerimetro() {
        System.out.println("calcolaPerimetro");
        InfoTriangolo instance = new InfoTriangolo(3, 3, 3);
        double expResult = 9;
        double result = instance.calcolaPerimetro();
        assertEquals(expResult, result);
    }

    /**
     * Test of calcolaArea method, of class Triangolo.
     */
    @Test
    public void testCalcolaArea() {
        System.out.println("calcolaArea");
        InfoTriangolo instance = new InfoTriangolo(3, 4, 5);
        double expResult = 6;
        double result = instance.areaTriangolo();
        assertEquals(expResult, result);
    }

    /**
     * Test of tipoTriangolo method, of class Triangolo.
     */
    @Test
    public void testTipoTriangoloEquilatero() {
        System.out.println("tipologiaTriangolo");
        InfoTriangolo instance = new InfoTriangolo(3, 3, 3);
        String expResult = "Equilatero";
        String result = instance.tipologiaTriangolo();
        assertEquals(expResult, result);

    }

    /**
     * Test of tipoTriangolo method, of class Triangolo.
     */
    @Test
    public void testTipoTriangoloIsoscele() {
        System.out.println("tipoTriangolo");
        InfoTriangolo instance = new InfoTriangolo(5, 7, 7);
        String expResult = "Isoscele";
        String result = instance.tipologiaTriangolo();
        assertEquals(expResult, result);

    }

    /**
     * Test of tipoTriangolo method, of class Triangolo.
     */
    @Test
    public void testTipologiaTriangoloScaleno() {
        System.out.println("tipologiaTriangolo");
        InfoTriangolo instance = new InfoTriangolo(5, 3, 1);
        String expResult = "Scaleno";
        String result = instance.tipologiaTriangolo();
        assertEquals(expResult, result);

    }

    
}
