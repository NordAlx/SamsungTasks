public class Player {
    protected Unit unit1;
    protected Unit unit2;
    protected Unit unit3;
    protected String name = "";

    public void setName(String name) {
        this.name = name;
    }

    public void setUnits(String unit1, String unit2, String unit3) {
        if (unit1.equals("W"))
            this.unit1.(unit1);
        else this.unit1.setName(unit1);
        if (unit3.equals("W"))
            this.unit2.setName(unit2);
        else this.unit2.setName(unit2);
        if (unit3.equals("W"))
            this.unit3.setName(unit3);
        else this.unit3.setName(unit3);
    }

    public String getName() {
        return name;
    }

}