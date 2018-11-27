import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Smokes", "Clive", 3);
    }

    @Test
    public void canGetName() {
        assertEquals("Smokes", tobaccoStall.getName());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Clive", tobaccoStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(3, tobaccoStall.getParkingSpot());
    }
}
