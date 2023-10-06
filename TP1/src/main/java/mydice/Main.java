package mydice;

public class Main {
    public static void main(String[] args) {
        DiceHandle handle = new DiceHandle();
        Dice die1 = new Dice(6);
        Dice die2 = new Dice(10);
        handle.addDice(die1);
        handle.addDice(die2);

        System.out.println(handle.toString());

        Dice die6 = new Dice(6);
        Dice die10 = new Dice(10);

        DiceHandle handle1 = new DiceHandle();
        handle.addDice(die6);
        handle.addDice(die10);

        int result = handle1.roll();
        System.out.println("Result: " + result);

        DiceHandle handle2 = new DiceHandle();
        handle2.addDice(die6);
        handle2.addDice(die6);

        DiceHandle combinedHandle = handle1.add(handle2);
        int combinedResult = combinedHandle.roll();
        System.out.println("Combined Result: " + combinedResult);
    }
}
