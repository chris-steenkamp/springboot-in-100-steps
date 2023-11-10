package com.carniware.learning.springoverview.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println(game.name());
        
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
