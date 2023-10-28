public class Main {
    public static void main(String[] args) {
        Game game1 = new Game();
        Unit unit1 = new Unit("Sasha");
        Unit unit2 = new Unit("Pasha");
        unit1.attack(unit2);
        unit2.attack(unit1);
        Game game = new Game();

        Wizard wizard1 = new Wizard("W1");
        Wizard wizard2 = new Wizard("W1");
        System.out.println(wizard1);
        System.out.println(wizard2);
        wizard1.attack(wizard2);
        wizard2.attack(wizard1);
        System.out.println(wizard1);
        System.out.println(wizard2);
        System.out.println(Game.countOfUnits);
        wizard1.print();
    }
}