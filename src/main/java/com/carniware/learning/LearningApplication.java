package com.carniware.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carniware.learning.game.GameRunner;
import com.carniware.learning.game.GamingConsole;
import com.carniware.learning.game.MarioGame;
import com.carniware.learning.game.PacManGame;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		GamingConsole game = new PacManGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}
}
