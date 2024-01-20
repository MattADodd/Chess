package Components;

import java.lang.Math;

public class Bishop extends Piece {
    public void printName() {
        System.out.print("B");
    }
    
    public void move(int[] position, int[] newPosition, Piece[][] state) {
        this.yesMove();
        
        if (Math.abs(newPosition[0] - position[0]) != Math.abs(newPosition[1] - position[1])) {
            this.noMove();
            return;
        }
        
        while ((newPosition[0] != position[0]) && (newPosition[1] != position[1])) {
            if (newPosition[0] != position[0]) {
                if (newPosition[0] > position[0]) {
                    newPosition[0] = newPosition[0] - 1;
                }
                if (newPosition[0] < position[0]) {
                    newPosition[0] = newPosition[0] + 1;
                }
            }
            if (newPosition[1] != position[1]) {
                if (newPosition[1] > position[1]) {
                    newPosition[1] = newPosition[1] - 1;
                }
                if (newPosition[1] < position[1]) {
                    newPosition[1] = newPosition[1] + 1;
                }
            }
            if (state[newPosition[0]][newPosition[1]] != null){
                 this.noMove();
                 return;
            }
        }
    }
}
