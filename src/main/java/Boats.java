import java.util.Vector;

public class Boats {
    private Boolean isAlive;
    private Boolean isVertical;
    private int length;
    Vector<Coordinate> coordinates;
    private int whoOwn;

    public Boats(){
        isAlive = true;
        length  = 0;
        coordinates  =new Vector<>();
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setVertical(Boolean vertical) {
        isVertical = vertical;
    }

    public Boolean getVertical() {
        return isVertical;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    public void addCoordinate(int _x, int _y){
        coordinates.add(new Coordinate(_x,_y));
    }

    public Vector<Coordinate> getCoordinates() {
        return coordinates;
    }

    public int getWhoOwn() {
        return whoOwn;
    }

    public void setWhoOwn(int whoOwn) {
        this.whoOwn = whoOwn;
    }
}
