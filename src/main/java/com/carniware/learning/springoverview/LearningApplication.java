package com.carniware.learning.springoverview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.carniware.learning.springoverview.enterprise.web.MyWebController;
import com.carniware.learning.springoverview.game.GameRunner;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearningApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);

		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);

		System.out.println(controller.returnValueFromService());
	}
}
