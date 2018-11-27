import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Flossin", "Claire", 9);
    }

    @Test
    public void canGetName() {
        assertEquals("Flossin", candyFlossStall.getName());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Claire", candyFlossStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(9, candyFlossStall.getParkingSpot());
    }

}
