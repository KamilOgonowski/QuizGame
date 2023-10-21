public class User {
    private String name;
    private int points = 0;

    public User(){
        String name = Console.getStringInput("Please provide name for the player: ");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
}

