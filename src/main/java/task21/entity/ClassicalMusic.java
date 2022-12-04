package task21.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music{

    public ClassicalMusic() {
    }

    @PostConstruct
    public void init() {
        System.out.println("initialization classical");
    }

    @Override
    public String getSong() {
        return "Classical music";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy classical");
    }
}
