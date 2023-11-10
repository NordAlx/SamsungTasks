import java.util.Scanner;

public class Game {
    Scanner scan = new Scanner(System.in);
    protected Player player1 = new Player();
    protected Player player2 = new Player();

    public void setPlayer(String name) {
        if (player1.getName().equals("")) {
            player1.setName(name);
        } else {
            player2.setName(name);
        }
    }

    public void setUnits1() {
        player1.setUnits(scan.nextLine(), scan.nextLine(), scan.nextLine());
    }

    public String getPlayer1Name() {
        return player1.getName();
    }

    public String getPlayer2Name() {
        return player2.getName();
    }
}