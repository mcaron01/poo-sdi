package mydiceTest;

import mydice.Dice;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class DiceTest {

    @Test
    public void testConstructeur() {
        Dice die = new Dice(4);
        assertEquals(die.getFaces(), 4);
    }

    @Test
    public void testRoll() {
        Dice die = new Dice(6); // Supposons que vous ayez une classe Die avec un constructeur qui prend le nombre de faces.
        int result = die.roll();
        assertTrue(result >= 1 && result <= 6);
    }

}
