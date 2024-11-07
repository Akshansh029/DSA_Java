
import java.util.ArrayList;
import java.util.List;

public class Tournament {

    List<Team> teams = new ArrayList<>();
    List<Group> groups = new ArrayList<>();
    List<Team> knockTeams = new ArrayList<>();
    List<Match> knockoutMatches = new ArrayList<>();
    private String finalWinner;

    // Creating 16 teams
    public void createTeams() {
        for (int i = 0; i < 16; i++) {
            teams.add(new Team(String.format("Team %d", i + 1)));
        }
    }

    // Creating 4 groups
    public void createGroups() {
        for (int i = 0; i < 4; i++) {
            // Extract 4 teams for each group
            Team[] groupTeams = new Team[4];
            for (int j = 0; j < 4; j++) {
                groupTeams[j] = teams.get(i * 4 + j);
            }
            Group group = new Group("Group " + (char) ('A' + i), groupTeams);
            groups.add(group);
        }
    }

    public void playGroupStages() {
        for (Group group : groups) {
            System.out.println(String.format("%s results: ", group.groupName));
            group.createMatches();
            System.out.println();
            Team qTeam1 = group.getQualifiedTeams()[0];
            Team qTeam2 = group.getQualifiedTeams()[1];
            knockTeams.add(qTeam1);
            knockTeams.add(qTeam2);
            System.out.println(String.format("Qualified teams of %s:\n", group.groupName) + qTeam1 + " and " + qTeam2);
            System.out.println();
        }
    }

    public void playKnockouts() {
        // Quaterfinal matches
        List<Team> quarterFinalWinners = new ArrayList<>();

        for (int i = 0; i < knockTeams.size(); i += 2) {
            Match match = new Match(knockTeams.get(i), knockTeams.get(i + 1));
            match.simulateKnockOut();
            String winner = match.getKnockOutSummary();
            quarterFinalWinners.add(winner.equals(knockTeams.get(i).getTeamName()) ? knockTeams.get(i) : knockTeams.get(i + 1));
        }

        // Semifinal matches
        List<Team> semiFinalWinners = new ArrayList<>();

        for (int i = 0; i < quarterFinalWinners.size(); i += 2) {
            Match match = new Match(quarterFinalWinners.get(i), quarterFinalWinners.get(i + 1));
            match.simulateKnockOut();
            String winner = match.getKnockOutSummary();
            semiFinalWinners.add(winner.equals(quarterFinalWinners.get(i).getTeamName()) ? quarterFinalWinners.get(i) : quarterFinalWinners.get(i + 1));
        }

        // Final
        Team winner = null;
        if (semiFinalWinners.size() == 2) {
            Match finalMatch = new Match(semiFinalWinners.get(0), semiFinalWinners.get(1));
            finalMatch.simulateKnockOut();
            winner = finalMatch.getKnockOutSummary().equals(semiFinalWinners.get(0).getTeamName()) ? semiFinalWinners.get(0) : semiFinalWinners.get(1);
        }

        finalWinner = winner.getTeamName(); // Set the final winner
    }

    public String getFinalWinner() {
        return finalWinner;
    }
}
