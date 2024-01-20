package Components;

public class Rook extends Piece {
    public void printName() {
        System.out.print("R");
    }
    
    public void move(int[] position, int[] newPosition, Piece[][] state) {
        this.yesMove();
        
        if ((newPosition[0] != position[0]) && (newPosition[1] != position[1])) {
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
