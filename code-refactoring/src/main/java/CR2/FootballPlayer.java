package CR2;

public class FootballPlayer {
    private String name = "";
    private double[] fortyYardDashTimes = null;

    public String getName() {
        return name;
    }

    public double[] getFortyYardDashTimes() {
        return fortyYardDashTimes;
    }

    public FootballPlayer(String name, double[] fortyYardDashTimes) {
        this.name = name;
        this.fortyYardDashTimes = fortyYardDashTimes;
    }
}
