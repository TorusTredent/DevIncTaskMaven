package task21;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import task21.config.JavaConfig;
import task21.entity.ClassicalMusic;
import task21.entity.Music;
import task21.entity.MusicPlayer;
import task21.entity.RockMusic;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);

        context.close();
    }
}
