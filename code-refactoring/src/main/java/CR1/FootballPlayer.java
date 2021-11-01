package CR1;

public class FootballPlayer {
    private double passerRating;
    private int rushingYards;
    private int receivingYards;
    private int totalTackles;
    private int interceptions;
    private int fieldGoals;
    private double avgPunt;
    private double avgKickoffReturn;
    private double avgPuntReturn;

    public double getPasserRating() {
        return passerRating;
    }

    private FootballPlayer(double passerRating, int rushingYards, int receivingYards,
                          int totalTackles, int interceptions, int fieldGoals,
                          double avgPunt, double avgKickoffReturn, double avgPuntReturn) {
        this.passerRating = passerRating;
        this.rushingYards = rushingYards;
        this.receivingYards = receivingYards;
        this.totalTackles = totalTackles;
        this.interceptions = interceptions;
        this.fieldGoals = fieldGoals;
        this.avgPunt = avgPunt;
        this.avgKickoffReturn = avgKickoffReturn;
        this.avgPuntReturn = avgPuntReturn;
    }

    public static FootballPlayer createQB(double passerRating, int rushingYards) {
        return new FootballPlayer(passerRating, rushingYards, 0, 0, 0, 0, 0, 0, 0);
    }

    public static void main(String[] args) {
        FootballPlayer aaronRodgers = FootballPlayer.createQB(108.0, 259);

        System.out.println("Aaron Rodgers Passer Rating: " + aaronRodgers.getPasserRating());
    }
}
