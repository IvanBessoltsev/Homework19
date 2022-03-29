package HW19;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        ResourceBundle resourceBundle = ResourceBundle.getBundle("text", Locale.US);
        Logger logger = context.getBean("myLogger", Logger.class);
        String str = resourceBundle.getString("welcome");
        logger.log(str);

        Game game = context.getBean("myGame", Game.class);
        game.welcome(resourceBundle);
        game.play(resourceBundle);

        context.close();

    }
}
