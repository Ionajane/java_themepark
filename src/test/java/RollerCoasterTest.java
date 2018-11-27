import Attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void before() {
        rollerCoaster = new RollerCoaster("Pepsi Max");
    }

    @Test
    public void canGetName() {
        assertEquals("Pepsi Max", rollerCoaster.getAttractionName());
    }

}
