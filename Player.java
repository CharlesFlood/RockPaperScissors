package RockPaperScissors;

public class Player {
    private boolean computer;//determines whether player is an AI or human user
    
    public Player(boolean comp){
        computer = comp;
    }
    
    public Gesture makeMove(){
        if(computer)
            return makeComputerMove();
        return makeUserMove();
    }
    private Gesture makeComputerMove(){
        return AI.makeMove();
    }
    private Gesture makeUserMove(){
        //gather info from display
        
        return new Gesture(0);
    }
}
