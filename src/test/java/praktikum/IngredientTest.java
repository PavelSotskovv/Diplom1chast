package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientTest {
    private Ingredient ingredient;

    @Before
    public void createNewInstance() {
        ingredient = new Ingredient(IngredientType.SAUCE, "chili", 20.0f);
    }

    @Test
    public void getName() {
        String expected = "chili";
        String actual = ingredient.getName();

        assertEquals("Ошибка в названии ингридиента", expected, actual);
    }

    @Test
    public void getPrice() {
        float expected = 20.0f;
        float actual = ingredient.getPrice();

        assertEquals("Ошибка в цене ингридиента", expected, actual, 0);
    }
}
