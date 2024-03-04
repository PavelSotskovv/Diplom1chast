package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {
    private Bun bun;

    @Before
    public void createNewInstance() {
        bun = new Bun("original", 200.0f);
    }

    @Test
    public void getName() {
        String expected = "original";
        String actual = bun.getName();

        assertEquals("Неправильные значения названия булки", expected, actual);
    }

    @Test
    public void getPrice() {
        float expected = 200.0f;
        float actual = bun.getPrice();

        assertEquals("Некорректная цена булки", expected, actual, 0);
    }
}
