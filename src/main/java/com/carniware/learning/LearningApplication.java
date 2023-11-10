package com.carniware.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carniware.learning.game.GameRunner;
import com.carniware.learning.game.GamingConsole;
import com.carniware.learning.game.MarioGame;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		GamingConsole game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}
}
