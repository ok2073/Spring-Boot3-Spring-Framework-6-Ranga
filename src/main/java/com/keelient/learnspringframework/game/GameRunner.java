package com.keelient.learnspringframework.game;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GameRunner {
    //private MarioGame game;
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        log.info("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
