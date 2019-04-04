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
import ejercicio4.ejercicio4;

/**
 *
 * @author JAVIER
 */
public class testEjercicio4 {


     @Test
    public void testdecTobase() {
        assertEquals("10011100010001", ejercicio4.decTobin(10001));
    

    }
    @Test
    public void tesbinTobase(){
        
        assertEquals(10001, ejercicio4.binTodec("10011100010001"));
    }

    
    
}
