package edu.escuelaing.arem.ASE.app;



import static edu.escuelaing.arem.ASE.app.Operaciones.desviacion;
import static edu.escuelaing.arem.ASE.app.Operaciones.media;
import static org.junit.Assert.assertEquals;

import org.decimal4j.util.DoubleRounder;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void pruebaMediaDesviacion1(){
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add((double)145);
        linkedList.add((double)546);
        linkedList.add((double)84);
        linkedList.add((double)5694);
        linkedList.add((double)494);
        linkedList.add((double)68546);
        linkedList.add((double)5464);
        linkedList.add((double)12);
        linkedList.add((double)134);
        linkedList.add((double)13214);
        double med = media(linkedList);
        double std = desviacion(linkedList);
   
        assertEquals(9433.3, DoubleRounder.round(med, 2), 0.0);
        assertEquals(21203.14, DoubleRounder.round(std, 2), 0.0);
       
     
     
        
    }
    
        @Test
    public void pruebaMediaDesviacion2(){
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(23.5);
        linkedList.add(56.5);
        linkedList.add(87.2);
        linkedList.add(95.1);
        linkedList.add(32.12);
        linkedList.add(46.8);
        linkedList.add(54.4);
        linkedList.add(33.2);
        linkedList.add(113.4);
        linkedList.add(1414.14);
        double med = media(linkedList);
        double std = desviacion(linkedList);
        
        assertEquals(195.64, DoubleRounder.round(med, 2), 0.0);
        assertEquals(429.16, DoubleRounder.round(std, 2), 0.0);
       
     
     
        
    }
}