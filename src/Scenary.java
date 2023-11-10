import java.util.Scanner;

public class Scenary {
    Scanner scan = new Scanner(System.in);
    Game game = new Game();

    public void greetings() {
        System.out.println("Приветствую! Назовите свое имя!");
        Game game = new Game();
        game.setPlayer(scan.nextLine());
        System.out.println("Будет еще игрок?");
        if (scan.nextLine().equals("Да")) {
            System.out.println("Назовите имя!");
            game.setPlayer(scan.nextLine());
        }
        this.game = game;
    }

    public void prepare() {
        System.out.println(game.getPlayer1Name() + "Выбирает героев: Wizard(W) или Terminator(T)");
        game.setUnits1();
    }
}
