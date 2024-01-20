package Components;

import java.lang.Math;

public class King extends Piece {
    public void printName() {
        System.out.print("K");
    }
    
    public void move(int[] position, int[] newPosition, Piece[][] state) {
        this.yesMove();
        
        if (Math.abs(position[0] - newPosition[0]) <= 1 
                && Math.abs(position[1] - newPosition[1]) <= 1) {
            this.noMove();
        }
    }
}
