package Components;

public class Piece {
    private boolean alive = true;
    private boolean isWhite = true;
    private boolean canMove = true;
    
    public void move(Piece[][] position) {
        
    }
    
    public void printName() {
        
    }
    
    public void makeBlack() {
        isWhite = false;
    }
    
    public boolean getColour() {
        return isWhite;
    }
}

