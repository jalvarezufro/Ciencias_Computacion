/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import cambiobase.CambioBase;

/**
 *
 * @author JAVIER
 */
public class testCambioBase {

    @Test
    public void testdecTobase() {
        assertEquals("110010", CambioBase.decTobase(50, 2));
        assertEquals("1010000", CambioBase.decTobase(80, 2));
        assertEquals("1212", CambioBase.decTobase(50, 3));
        assertEquals("5B", CambioBase.decTobase(86, 15));

    }

    @Test
    public void testbaseTodec() {

        assertEquals(50, CambioBase.baseTodec("110010", 2));
        assertEquals(20, CambioBase.baseTodec("15", 15));
        assertEquals(996, CambioBase.baseTodec("826", 11));
        assertEquals(95, CambioBase.baseTodec("5F", 16));
        assertEquals(3003, CambioBase.baseTodec("BBB", 16));
        assertEquals(10, CambioBase.baseTodec("A", 32));

    }

    @Test
    public void testbaseTobase() {

        assertEquals("A0", CambioBase.baseTobase("12120", 3, 15));
        assertEquals("A09A", CambioBase.baseTobase("102147", 8, 15));
        assertEquals("4EC27", CambioBase.baseTobase("102147", 12, 15));
    }

}
