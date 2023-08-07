import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int dogCount = 3;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        System.out.println("==================================================================================");
        flipNHeads(3);
        System.out.println("==================================================================================");
        clock();
    }

    public static String pluralize(String word, int number) {
        if (number == 0 || number > 1)
            return word + 's';
        return word;

    }

    public static void flipNHeads(int number) {
        Random random = new Random();
        int flips = 0;
        int heads = 0;

        while (heads < number) {
            double randomNumber = random.nextDouble();
            if (randomNumber >= 0.5) {
                System.out.println("Heads");
                heads++;
            } else {
                System.out.println("Tails");
                heads = 0;
            }
            flips++;
        }

        System.out.println("It took " + flips + " flips to flip " + number + " heads in a row.");
    }

    public static void clock() {
        LocalDateTime prevTime = null;
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if (prevTime == null || now.getSecond() != prevTime.getSecond()) {
                System.out.println(time);
                prevTime = now;
            }
        }
    }

}
