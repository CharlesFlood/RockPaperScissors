package RockPaperScissors;
import java.util.Scanner;
public class Display {
    Scanner in;

    public Display() {
        in = new Scanner("System.in");
    }
    
    public int getNumberOfRounds(){
        System.out.print("How many rounds will you be playing? ");
        int val = in.nextInt();
        return val;
    }
    
    public void trace(String str){
        System.out.println(str);
    }
    
    
}
