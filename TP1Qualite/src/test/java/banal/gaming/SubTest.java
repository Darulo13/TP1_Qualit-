package banal.gaming;


import junit.framework.TestCase;

public class SubTest extends TestCase{


    /**
     * Test si la fonction sub de la classe Sub fontionne
     */
    public void testSub(){
        int a = 3;
        int b = 2;
        assertEquals(1, new Sub().sub(a, b)); 
    }
}
