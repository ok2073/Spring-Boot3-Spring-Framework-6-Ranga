package com.keelient.learnspringframework.game;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SuperContragame implements GamingConsole{
    public void up() {
        log.info("Jump");
    }

    public void down() {
        log.info("Sit down");
    }

    public void left() {
        log.info("Go left");
    }

    public void right() {
        log.info("Shoot a bullet");
    }
}
