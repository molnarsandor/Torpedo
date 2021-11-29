public class Player {
    private int id;
    private String nickname;
    OneBoxBoat oneBoxBoat;
    TwoBoxBoat twoBoxBoat;
    private boolean isAlive;
    Board board;
    public Player(String _nickname,int _id){
        this.nickname = _nickname;
        this.id= _id;
        this.isAlive = true;
        board = new Board(_id, _nickname);

    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getId() {
        return id;
    }
    public Boolean getIsAlive(){
        return isAlive;
    }

    public void setOneBoxBoat(OneBoxBoat oneBoxBoat) {
        this.oneBoxBoat = oneBoxBoat;
    }

    public String getNickname() {
        return nickname;
    }
}
