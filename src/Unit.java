public class Unit {
    protected String name;
    public Unit(String name) {
        this.name = name;
        Game.countOfUnits++;
    }
    protected int health = 100;
    protected int defense = 100;
    protected int power = 10;
    protected float criticalChance = 0.1f;
    protected float parryChance = 0.1f;

     public int getHealth(){
         return health;
     }
     public void setHealth(int health){
         this.health = health;
     }
     public int getPower(){
         return power;
     }

    public int getDefense() {
        return defense;
    }

    public float getCriticalChance() {
        return criticalChance;
    }

    public float getParryChance() {
        return parryChance;
    }
    public void attack(Unit unit){
         unit.getDamage(power);
    }
    public void getDamage(int damage){
         this.health -= damage;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", defense=" + defense +
                ", power=" + power +
                '}';
    }
}
