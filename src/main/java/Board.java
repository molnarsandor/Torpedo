import java.util.Vector;

public class Board {

    /* 0 - alap állapot
       1 - player 1 hajója
       2 - player 2 hajója
    * */

    int[][] board;
    int playerId;
    String playerName;
    public Board(int _id, String _playerName){
        this.playerId = _id;
        this.playerName = _playerName;
        this.board = new int[10][10];
        initBoard();
    }

    private void initBoard(){

        for(int i=0;i<board.length;i++){
            for(int j=0;j< board[i].length;j++){
                board[i][j]=0;
            }
        }
    }

    public void printBoard(){
        System.out.println(playerName+'('+playerId+')'+" Táblája: ");
        for(int i=0;i<board.length;i++){
            for(int j=0;j< board[i].length;j++){
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void addBoat(Boats boats){
        Vector<Coordinate> coordinates = boats.getCoordinates();
        if(checkPlaceIsEmpty(coordinates)) {
            for (Coordinate coordinate : coordinates) {
                board[coordinate.getX() - 1][coordinate.getY() - 1] = boats.getWhoOwn();
            }
        }
        else{
            System.out.println("Már van itt hajód! Helyezd máshová!");
        }
    }

    public boolean checkPlaceIsEmpty(Vector<Coordinate> coordinates){
        for (Coordinate coordinate : coordinates) {
            if(board[coordinate.getX()-1][coordinate.getY()-1] != 0){
                return false;
            }
        }
        return true;

    }

}
