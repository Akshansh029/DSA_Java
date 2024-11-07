
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Team[] participants = new Team[16];

        System.out.println("Welcome to Football Tournament Simulation!");

        for (int i = 0; i < participants.length; i++) {
            System.out.printf("Enter team %d: ", i + 1);
        }

    }
}
