package CR1;

public class FootballPlayer2 {
    private String playerName = "";
    private String college = "";
    private double fortyYardDash = 0.0;
    private int repsBenchPress = 0;
    private double sixtyYardDash = 0.0;

    public String getPlayerName() {
        return playerName;
    }

    public String getCollege() {
        return college;
    }

    public double getFortyYardDash() {
        return fortyYardDash;
    }

    public int getRepsBenchPress() {
        return repsBenchPress;
    }

    public double getSixtyYardDash() {
        return sixtyYardDash;
    }

    public FootballPlayer2(String playerName, String college, double fortyYardDash, int repsBenchPress, double sixtyYardDash) {
        this.playerName = playerName;
        this.college = college;
        this.fortyYardDash = fortyYardDash;
        this.repsBenchPress = repsBenchPress;
        this.sixtyYardDash = sixtyYardDash;
    }

    public FootballPlayer2(String playerName, String college, double fortyYardDash, int repsBenchPress) {
        this(playerName, college, fortyYardDash, repsBenchPress, 0.0);
    }

    public FootballPlayer2(String playerName, String college, double fortyYardDash, double sixtyYardDash) {
        this(playerName, college, fortyYardDash, 0, sixtyYardDash);
    }

    public static void main(String[] args) {
        FootballPlayer2 jamellFleming = new FootballPlayer2("Jamell Fleming", "Oklahoma", 4.53, 0, 10.75);

        System.out.println(jamellFleming.getPlayerName());
        System.out.println(jamellFleming.getCollege());
        System.out.println(jamellFleming.getFortyYardDash());
        System.out.println(jamellFleming.getRepsBenchPress());
        System.out.println(jamellFleming.getSixtyYardDash());
    }
}
