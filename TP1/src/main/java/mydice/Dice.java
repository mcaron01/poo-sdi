package mydice;

public class Dice {
    protected int faces;

    public int getFaces() {
        return faces;
    }

    public void setFaces(int faces) {
        this.faces = faces;
    }

    public Dice(){
    }

    public Dice(int faces){
        this.faces = faces;
    }
    
    public int roll() {
       return (int) (Math.random() * faces) + 1;
    }

    @Override
    public String toString() {
        return "Dice (" + faces + ")";
    }
}
