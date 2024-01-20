package Components;

public class Pawn extends Piece {
    public void printName() {
        System.out.print("P");
    }
    
    public void move(int[] position, int[] newPosition, Piece[][] state) {
        if ((newPosition[0] == position[0] + 1) && (newPosition[1] == position[1] && (state[newPosition[0]][newPosition[1]] == null))) {
            this.yesMove();
        } else {
            this.noMove();
        }
    }
}
