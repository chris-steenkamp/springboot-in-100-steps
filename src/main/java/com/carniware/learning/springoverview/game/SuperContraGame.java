package com.carniware.learning.springoverview.game;

public class SuperContraGame implements GamingConsole {
    public String name() {
        return "SuperContraGame";
    }

    public void up() {
        System.out.println("up");
    }

    public void down() {
        System.out.println("down");
    }

    public void left() {
        System.out.println("left");
    }

    public void right() {
        System.out.println("right");
    }
}
