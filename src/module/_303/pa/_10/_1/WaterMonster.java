package module._303.pa._10._1;

public class WaterMonster extends Monster{
    WaterMonster(String name) {
        super(name);
    }
    @Override
    public String attack() {
        return "Attack with water!";
    }
}
