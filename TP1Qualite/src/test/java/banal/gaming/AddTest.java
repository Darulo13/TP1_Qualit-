package banal.gaming;


import junit.framework.TestCase;

public class AddTest {
    public void testAdd() {
        int a = 2;
        int b = 3;
        Add adder = new Add();
        int result = adder.add(a, b);
        TestCase.assertEquals(5, result);
    }

}
