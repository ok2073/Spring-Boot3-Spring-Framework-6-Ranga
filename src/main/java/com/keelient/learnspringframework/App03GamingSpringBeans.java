package com.keelient.learnspringframework;

import com.keelient.learnspringframework.game.GameRunner;
import com.keelient.learnspringframework.game.GamingConsole;
import com.keelient.learnspringframework.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

        context.getBean(GamingConsole.class).up();
    }
}
