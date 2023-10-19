import java.util.ArrayList;
import java.util.Random;

public class Game {
    private static int gameCounter = 0;
    private static ArrayList<Game> gamesPlayed = new ArrayList<>();
    private static Random random = new Random();
    
    private int gameID;
    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;
    private int temperature;

    public Game(Team homeTeam, Team awayTeam, int temperature) {
        this.gameID = ++gameCounter;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.temperature = temperature;

        this.homeScore = random.nextInt(temperature / 10 + 1); // Assuming each 10 degrees increases a goal chance
        this.awayScore = random.nextInt(temperature / 10 + 1);

        if (homeScore > awayScore) {
            homeTeam.addWin();
            awayTeam.addLoss();
        } else if (homeScore < awayScore) {
            homeTeam.addLoss();
            awayTeam.addWin();
        } else {
            homeTeam.addTie();
            awayTeam.addTie();
        }

        homeTeam.addGoalsScored(homeScore);
        homeTeam.addGoalsAllowed(awayScore);
        awayTeam.addGoalsScored(awayScore);
        awayTeam.addGoalsAllowed(homeScore);

        gamesPlayed.add(this);
    }

    public static ArrayList<Game> getGamesPlayed() {
        return gamesPlayed;
    }

    @Override
    public String toString() {
        return "Game #" + gameID + "\nTemperature: " + temperature + 
               "\nAway Team: " + awayTeam.getName() + ", " + awayScore +
               "\nHome Team: " + homeTeam.getName() + ", " + homeScore;
    }
}
