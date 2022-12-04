package task21;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import task21.entity.ClassicalMusic;
import task21.entity.Music;
import task21.entity.MusicPlayer;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(music);
        classicalMusicPlayer.playMusic();

        context.close();
    }
}
