package POJO;
import java.util.Map;

public class Scorers {
    private int numberOfGoals;
    private Map<String ,Object> player;

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    public Map<String, Object> getPlayer() {
        return player;
    }

    public void setPlayer(Map<String, Object> player) {
        this.player = player;
    }
}