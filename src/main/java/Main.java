import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
       initPlayerOne();
       initPlayerTwo();
       System.out.println("MINDEN HAJÓ KÉSZEN ÁLL, KEZDŐDJÖN A JÁTÉK!");

    }
    public static void initPlayerOne() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Player playerOne;
        int x = 0;
        int y = 0;
        String direction;

        System.out.println("Player 1 adja meg a nevét: ");
        playerOne = new Player(reader.readLine(),1);

        System.out.println(playerOne.getNickname()+" helyezze el az első hajóját!");
        while(!playerOne.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.println();
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            playerOne.board.addBoat(new OneBoxBoat(x, y, 1));

        }
        playerOne.board.setBoatAdded(false);
        playerOne.board.printBoard();

        System.out.println(playerOne.getNickname()+" helyezze el a második hajóját!");
        x=0; y=0;
        while(!playerOne.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.println();
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Vertikálisan vagy horizontálisan? v/h :");
            direction = reader.readLine();
            playerOne.board.addBoat(new TwoBoxBoat(x, y, 1, (direction.equals("v"))));
        }
        playerOne.board.setBoatAdded(false);
        playerOne.board.printBoard();

        System.out.println(playerOne.getNickname()+" helyezze el a harmadik hajóját!");
        x=0; y=0;
        while(!playerOne.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.println();
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Vertikálisan vagy horizontálisan? v/h :");
            direction = reader.readLine();
            playerOne.board.addBoat(new ThreeBoxBoat(x, y, 1, (direction.equals("v"))));
        }
        playerOne.board.setBoatAdded(false);
        playerOne.board.printBoard();

        System.out.println(playerOne.getNickname()+" helyezze el a negyedik hajóját!");
        x=0; y=0;
        while(!playerOne.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.println();
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Vertikálisan vagy horizontálisan? v/h :");
            direction = reader.readLine();
            playerOne.board.addBoat(new FourBoxBoat(x, y, 1, (direction.equals("v"))));
        }
        playerOne.board.setBoatAdded(false);
        playerOne.board.printBoard();

        System.out.println(playerOne.getNickname()+" helyezze el az ötödik hajóját!");
        x=0; y=0;
        while(!playerOne.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.println();
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Vertikálisan vagy horizontálisan? v/h :");
            direction = reader.readLine();
            playerOne.board.addBoat(new FiveBoxBoat(x, y, 1, (direction.equals("v"))));
        }
        playerOne.board.setBoatAdded(false);
        playerOne.board.printBoard();


    }

    public static void initPlayerTwo() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Player playerTwo;
        int x;
        int y;
        String direction;

        System.out.println("Player 2 adja meg a nevét: ");
        playerTwo = new Player(reader.readLine(),2);


        System.out.println(playerTwo.getNickname()+" helyezze el az első hajóját!");
        x=0; y=0;
        while(!playerTwo.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.println();
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            playerTwo.board.addBoat(new OneBoxBoat(x, y, 2));
        }
        playerTwo.board.setBoatAdded(false);
        playerTwo.board.printBoard();

        System.out.println(playerTwo.getNickname()+" helyezze el a második hajóját!");
        x=0; y=0;
        while(!playerTwo.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.println();
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Vertikálisan vagy horizontálisan? v/h :");
            direction = reader.readLine();
            playerTwo.board.addBoat(new TwoBoxBoat(x, y, 2, (direction.equals("v"))));
        }
        playerTwo.board.setBoatAdded(false);
        playerTwo.board.printBoard();

        System.out.println(playerTwo.getNickname()+" helyezze el a harmadik hajóját!");
        x=0; y=0;
        while(!playerTwo.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.println();
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Vertikálisan vagy horizontálisan? v/h :");
            direction = reader.readLine();
            playerTwo.board.addBoat(new ThreeBoxBoat(x, y, 2, (direction.equals("v"))));
        }
        playerTwo.board.setBoatAdded(false);
        playerTwo.board.printBoard();

        System.out.println(playerTwo.getNickname()+" helyezze el a negyedik hajóját!");
        x=0; y=0;
        while(!playerTwo.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.println();
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Vertikálisan vagy horizontálisan? v/h :");
            direction = reader.readLine();
            playerTwo.board.addBoat(new FourBoxBoat(x, y, 2, (direction.equals("v"))));
        }
        playerTwo.board.setBoatAdded(false);
        playerTwo.board.printBoard();

        System.out.println(playerTwo.getNickname()+" helyezze el az ötödik hajóját!");
        x=0; y=0;
        while(!playerTwo.board.getBoatAdded()) {
        System.out.print("x: ");
        x = Integer.parseInt(reader.readLine());
        System.out.println();
        System.out.print("y: ");
        y = Integer.parseInt(reader.readLine());
        System.out.print("Vertikálisan vagy horizontálisan? v/h :");
        direction = reader.readLine();
        playerTwo.board.addBoat(new FiveBoxBoat(x,y,2,(direction.equals("v"))));}
        playerTwo.board.setBoatAdded(false);
        playerTwo.board.printBoard();





    }
}
