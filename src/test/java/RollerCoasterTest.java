import Attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void before() {
        rollerCoaster = new RollerCoaster("Pepsi Max");
        visitor = new Visitor(14, 150.12, 50.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Pepsi Max", rollerCoaster.getAttractionName());
    }

    @Test
    public boolean hasReachedHeight() {
        visitor = new Visitor(14, 150.12, 50.00);
        assertEquals(true, rollerCoaster.isAllowed());
    }

}
