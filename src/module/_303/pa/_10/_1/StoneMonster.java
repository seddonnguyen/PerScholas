package module._303.pa._10._1;

public class StoneMonster extends Monster {
    StoneMonster(String name) {
        super(name);
    }
    @Override
    public String attack() {
        return "Attack with stones!";
    }
}
