package banal.gaming;


import junit.framework.TestCase;

public class SubTest extends TestCase{

    public void testSub(){
        int a = 3;
        int b = 2;
        assertEquals(1, new Sub().sub(a, b)); 
    }
}
