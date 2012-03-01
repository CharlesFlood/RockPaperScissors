package RockPaperScissors;

public class Game {
    
    public static Display display;
    public static Player ply[];
    
    public static void main(String[] args){
        //store variables (relatively globally)
        
        Match match = new Match();
        display = new Display();
        match.playMatch();
        
    }
    
}
