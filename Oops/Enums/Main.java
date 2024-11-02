
public class Main {

    enum Week {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
        // These are called Enum constants
        // They all are public, static and final
        // Their type is Week
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for (Week day : Week.values()) {
            System.out.println(day);
        }
    }
}
