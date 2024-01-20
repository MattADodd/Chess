package Components;

public class Knight extends Piece {
    public void printName() {
        System.out.print("N");
    }
    
    public void move(int[] position, int[] newPosition, Piece[][] state) {
        this.yesMove();
        
        if (((newPosition[0] != position[0] + 2) || (newPosition[0] != position[0] + 2) 
                && (newPosition[1] != position[1] + 1) || (newPosition[1] != position[1] - 1)) 
                ^ ((newPosition[1] != position[1] + 2) || (newPosition[1] != position[1] + 2) 
                        && (newPosition[0] != position[0] + 1) || (newPosition[0] != position[0] - 1)) ) {
            this.noMove();
        }
    }
}
