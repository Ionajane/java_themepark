import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("Ice Ice Baby", "Joey", 12);
    }

    @Test
    public void canGetName() {
        assertEquals("Ice Ice Baby", iceCreamStall.getName());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Joey", iceCreamStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(12, iceCreamStall.getParkingSpot());
    }


}
