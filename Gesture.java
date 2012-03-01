package RockPaperScissors;

public class Gesture {
    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int Scissors = 2;
    
    private int gesture;

    public Gesture(int gesture) {
        this.gesture = gesture;
    }
    public int getGesture() {
        return gesture;
    }
    
}
