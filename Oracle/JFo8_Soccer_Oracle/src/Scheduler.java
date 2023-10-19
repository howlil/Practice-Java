import javax.swing.JOptionPane;

public class Scheduler {
    private Team[] teams;
    private int consecutiveColdWeeks = 0;

    public Scheduler(Team[] teams) {
        this.teams = teams;
    }

    public void startSeason() {
        while (consecutiveColdWeeks < 3) {
            String tempStr = JOptionPane.showInputDialog("Enter the temperature for this week (or 'exit' to end season):");
            
            if ("exit".equalsIgnoreCase(tempStr)) {
                displayResults();
                return;
            }

            try {
                int temp = Integer.parseInt(tempStr);
                
                if (temp <= 32) {
                    consecutiveColdWeeks++;
                    JOptionPane.showMessageDialog(null, "Too cold to play.");
                    if (consecutiveColdWeeks == 3) {
                        JOptionPane.showMessageDialog(null, "Season is over");
                        displayResults();
                        return;
                    }
                } else {
                    consecutiveColdWeeks = 0;
                    playGames(temp);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid temperature.");
            }
        }
    }

    private void playGames(int temp) {
        int[] indices = {0, 1, 2, 3};
    
        for (int i = 0; i < indices.length; i++) {
            int randomIndex = (int) (Math.random() * indices.length);
            int tempValue = indices[i];
            indices[i] = indices[randomIndex];
            indices[randomIndex] = tempValue;
        }
    
        Team homeTeam1 = teams[indices[0]];
        Team awayTeam1 = teams[indices[1]];
        Team homeTeam2 = teams[indices[2]];
        Team awayTeam2 = teams[indices[3]];
    
        new Game(homeTeam1, awayTeam1, temp);
        new Game(homeTeam2, awayTeam2, temp);
    }
    
    private void displayResults() {
        StringBuilder results = new StringBuilder("*********RESULTS*********\n");
        for (Team team : teams) {
            results.append(team).append("\n\n");
        }

        for (Game game : Game.getGamesPlayed()) {
            results.append(game).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, results.toString());
    }
}
