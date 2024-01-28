package com.keelient.learnspringframework.game;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class PacManGame implements GamingConsole{
    public void up() {
        log.info("up");
    }

    public void down() {
        log.info("down");
    }

    public void left() {
        log.info("left");
    }

    public void right() {
        log.info("right");
    }
}
