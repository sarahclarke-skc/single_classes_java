import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(80);
    }

    @Test
    public void hasVolume() {
        assertEquals(80, waterBottle.getVolume());
    }

    @Test
    public void canDrink() {
        assertEquals(70, waterBottle.drink());
    }

    @Test
    public void canEmpty() {
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void canFill() {
        waterBottle.empty();
        assertEquals(100, waterBottle.fill());
    }

}
