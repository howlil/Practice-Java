public class Team {
    private String name;
    private int wins;
    private int losses;
    private int ties;
    private int totalGoalsScored;
    private int totalGoalsAllowed;

    public Team(String name) {
        this.name = name;
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
        this.totalGoalsScored = 0;
        this.totalGoalsAllowed = 0;
    }

    public String getName() {
        return name;
    }

    public void addWin() {
        this.wins++;
    }

    public void addLoss() {
        this.losses++;
    }

    public void addTie() {
        this.ties++;
    }

    public void addGoalsScored(int goals) {
        this.totalGoalsScored += goals;
    }

    public void addGoalsAllowed(int goals) {
        this.totalGoalsAllowed += goals;
    }

    @Override
    public String toString() {
        return "Team " + name + "\nWins: " + wins + ", Losses: " + losses + ", Ties: " + ties +
               "\nPoints Scored: " + totalGoalsScored + ", Points Allowed: " + totalGoalsAllowed;
    }
}
