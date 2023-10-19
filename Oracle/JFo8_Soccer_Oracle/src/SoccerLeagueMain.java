public class SoccerLeagueMain {
    public static void main(String[] args) {
        Team team1 = new Team("Team 1");
        Team team2 = new Team("Team 2");
        Team team3 = new Team("Team 3");
        Team team4 = new Team("Team 4");
        Team[] teams = {team1, team2, team3, team4};

        Scheduler scheduler = new Scheduler(teams);
        scheduler.startSeason();
    }
}
