public class Slime {

    public final static String[] COLORS = {"Blue", "Red", "Green", "Yellow", "Silver"};
    private String color;
    private int health;

    public Slime(String color, int health) {
        this.color = color;
        this.health = health;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
