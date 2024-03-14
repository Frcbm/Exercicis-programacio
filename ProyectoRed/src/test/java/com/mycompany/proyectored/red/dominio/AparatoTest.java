package com.mycompany.proyectored.red.dominio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AparatoTest {
    
    @Test
    public void testApagar() {
        System.out.println("apagar");
        Aparato instance = new Aparato(0);
        instance.apagar();
        assertFalse(instance.getStatus());
    }

    @Test
    public void testEncender() {
        System.out.println("encender");
        Aparato instance = new Aparato(0);
        instance.encender();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getStatus());
    }   

    
}
