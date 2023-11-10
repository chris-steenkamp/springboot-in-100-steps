package com.carniware.learning.springoverview.game;

public class PacManGame implements GamingConsole {
    public String name() {
        return "PacManGame";
    }

    public void up() {
        System.out.println("^");
    }

    public void down() {
        System.out.println("v");
    }

    public void left() {
        System.out.println("<");
    }

    public void right() {
        System.out.println(">");
    }
}
