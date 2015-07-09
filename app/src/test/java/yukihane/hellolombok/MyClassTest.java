package yukihane.hellolombok;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yuki on 15/07/09.
 */
public class MyClassTest {

    @Test
    public void testGetName() throws Exception {
        MyClass obj = new MyClass();
        assertNull(obj.getName());

        obj.setName("my name");
        assertEquals("my name", obj.getName());
    }
}