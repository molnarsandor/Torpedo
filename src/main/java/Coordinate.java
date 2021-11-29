public class Coordinate {
    private int x;
    private int y;
    private boolean isAlive;

    public Coordinate(int _x, int _y) {
        this.x = _x;
        this.y = _y;
        this.isAlive = true;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void hitBox() {
        isAlive = false;
    }
    public boolean getIsAlive(){
        return isAlive;
    }
}
