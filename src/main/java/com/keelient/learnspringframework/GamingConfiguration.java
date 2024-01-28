package com.keelient.learnspringframework;

import com.keelient.learnspringframework.game.GamingConsole;
import com.keelient.learnspringframework.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new PacManGame();
        return game;
    }
}
