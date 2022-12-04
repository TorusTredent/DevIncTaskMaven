package task21.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class RockMusic implements Music{

    public RockMusic() {
    }

    @PostConstruct
    public void init() {
        System.out.println("initialization rock");
    }

    @Override
    public String getSong() {
        return "Rock music";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy rock");
    }
}
