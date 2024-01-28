package com.keelient.learnspringframework;

import com.keelient.learnspringframework.game.GameRunner;
import com.keelient.learnspringframework.game.PacManGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new SuperContragame();

        //1: Object creation
        var game = new PacManGame();

        //2: Object creation + Wiring of dependencies
        //  Game is a dependency of GameRunner class
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
