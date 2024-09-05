// package JavaBasics;

public class randomNumber {

    public static void main(String[] args) {
        do {
            int randomNum = (int) (Math.random() * 10 + 1);
            System.out.println(randomNum);
            if (randomNum == 5) {
                System.out.println("Ending loop");
                break;
            }
        } while (true);
    }
}
