import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor(14, 150.12, 50.00);
    }

    @Test
    public void canGetAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void canGetHeight() {
        assertEquals(150.12, visitor.getHeight(), 0.01);
    }

    @Test
    public void hasMoney() {
        assertEquals(50.00, visitor.getMoney(), 0.01);
    }

}
;