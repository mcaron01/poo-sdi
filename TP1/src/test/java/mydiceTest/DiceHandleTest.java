package mydiceTest;

import mydice.Dice;
import mydice.DiceHandle;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class DiceHandleTest {

    @Test
    public void testAddDie() {
        DiceHandle dieHandle = new DiceHandle();
        Dice die = new Dice(6);
        dieHandle.addDice(die);

        assertEquals(1, dieHandle.diceNumber());
    }

    @Test
    public void testDiceNumber() {
        DiceHandle dieHandle = new DiceHandle();
        Dice die1 = new Dice(6);
        Dice die2 = new Dice(10);

        dieHandle.addDice(die1);
        dieHandle.addDice(die2);

        assertEquals(2, dieHandle.diceNumber());
    }

    @Test
    public void testRoll() {
        DiceHandle handle = new DiceHandle();
        handle.addDice(new Dice(6)); // Add a die with 6 faces
        handle.addDice(new Dice(10)); // Add a die with 10 faces

        int result = handle.roll(); // Roll the handle

        // The result should be between the number of dice and the sum of face numbers
        assertTrue(result >= 2 && result <= 16); // 2 is the number of dice, 16 is the sum of face numbers (6 + 10)
    }
}
