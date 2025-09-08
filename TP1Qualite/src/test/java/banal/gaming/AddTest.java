package banal.gaming;


import junit.framework.TestCase;

public class AddTest extends TestCase {
    public void testAdd(){
        int a = 2;
        int b = 3;
        Add adder = new Add();
        int result = adder.add(a, b);
        assertEquals(5, result);
    }

}
