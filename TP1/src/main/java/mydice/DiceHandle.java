package mydice;

import java.util.ArrayList;
import java.util.List;

public class DiceHandle {

    private List<Dice> dice;

    public DiceHandle() {
        dice = new ArrayList<>();
    }

    public void addDice(Dice die) {
        dice.add(die);
    }

    public int diceNumber() {
        return dice.size();
    }

    public int roll() {
        int sum = 0;
        for (Dice die : dice) {
            sum += die.roll();
        }
        return sum;
    }

    public DiceHandle add(DiceHandle other) {
        DiceHandle result = new DiceHandle();
        result.dice.addAll(this.dice);
        result.dice.addAll(other.dice);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Dice die : dice) {
            result.append(die.toString()).append(" ");
        }
        return result.toString();
    }
}
