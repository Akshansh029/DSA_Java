
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Football Tournament Simulation!\n");

        Tournament UCL = new Tournament();
        UCL.createTeams();
        UCL.createGroups();
        UCL.playGroupStages();
    }
}
