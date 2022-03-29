package HW19;

import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Game {
    public Logger logger;

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void welcome(ResourceBundle resourceBundle) {
        String str = resourceBundle.getString("welcome");
        logger.log(str);
    }

    public void play(ResourceBundle resourceBundle) {
        int b = new Random().nextInt(1000);
        while (true) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a > b) {
                logger.log(resourceBundle.getString("smaller"));
            }
            if (a < b) {
                logger.log(resourceBundle.getString("bigger"));
            }
            if (a == b) {
                logger.log(resourceBundle.getString("end") + b);
                break;
            }
        }
    }

}
