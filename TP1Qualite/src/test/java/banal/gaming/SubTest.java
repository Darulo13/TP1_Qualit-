package banal.gaming;

import junit.framework.TestCase;

public class SubTest {

    public void testSub(){
        int a = 3;
        int b = 2;
        TestCase.assertEquals(1, new Sub().sub(a, b)); 
    }
}
