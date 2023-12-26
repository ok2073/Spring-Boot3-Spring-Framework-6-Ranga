package com.keelient.learnspringframework;

import com.keelient.learnspringframework.game.GameRunner;
import com.keelient.learnspringframework.game.PacManGame;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new SuperContragame();
        var game = new PacManGame();

        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
