import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int degit = random.nextInt(100) + 1;
        int attempt = 0;

        while (true) {
            System.out.println("Choose your degit");
            int yourDegit = scanner.nextInt();

            if (yourDegit == 0) {
                System.out.println("Exit");
                break;
            }
            attempt++;
            System.out.println("Attempts: "+ attempt);
            if (yourDegit > degit) {
                System.out.println("Выбери меньшее");
                continue;
            }
            if (yourDegit < degit) {
                System.out.println("Выбери большее");
                continue;
            }
            if (yourDegit == degit) {
                System.out.println("You are right");
                break;

            }

        }



    }
}

