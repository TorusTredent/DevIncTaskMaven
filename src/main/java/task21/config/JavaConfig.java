package task21.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import task21.entity.ClassicalMusic;
import task21.entity.Music;
import task21.entity.MusicPlayer;
import task21.entity.RockMusic;

@Configuration
@ComponentScan("task21.entity")
public class JavaConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(@Qualifier("classicalMusic") Music music) {
        return new MusicPlayer(music);
    }
}
