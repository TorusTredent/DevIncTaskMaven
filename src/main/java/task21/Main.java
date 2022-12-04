package task21;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import task21.entity.MusicPlayer;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
