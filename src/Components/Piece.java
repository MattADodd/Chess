package Components;

public class Piece {
    private boolean alive = true;
    private boolean isWhite = true;
    private boolean canMove = true;
    
    public void move(int[] position, int[] newPosition, Piece[][] state) {
        
    }
    
    public void printName() {
        
    }
    
    public void makeBlack() {
        isWhite = false;
    }
    
    public boolean getColour() {
        return isWhite;
    }
    
    public void noMove() {
        canMove = false;
    }
    
    public void yesMove() {
        canMove = true;
    }
    
    public boolean getCanMove() {
        return canMove;
    }
}

