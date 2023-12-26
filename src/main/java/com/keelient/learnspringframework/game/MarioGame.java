package com.keelient.learnspringframework.game;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MarioGame implements GamingConsole{

    public void up() {
        log.info("Jump");
    }

    public void down() {
        log.info("Go into a hole");
    }

    public void left() {
        log.info("Go left");
    }

    public void right() {
        log.info("Accelerate");
    }
}
