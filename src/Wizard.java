public class Wizard extends Unit{

    protected int mana = 100;
    int power = 25;

    public Wizard(String name) {
        super(name);
        power = 25;
        health = 80;
    }

    @Override
    public void attack(Unit unit) {
        if (mana != 0)
            super.attack(unit);
        mana -= 25;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", power=" + power +
                ", health=" + health +
                ", defense=" + defense +
                '}';
    }
    public void print(String str){
        System.out.println(str + " " + this);
    }
    public void print(){
        System.out.println(this);
    }
    public void print(int str){
        System.out.println(str + " " + this);
    }

}
