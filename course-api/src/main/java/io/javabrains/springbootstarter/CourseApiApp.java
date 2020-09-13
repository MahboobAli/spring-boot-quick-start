package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * REST request uri:
 * -----------------
 * GET		/topics			Gets all topics
 * GET		/topics/id		Gets the topic
 * POST		/topics			Create new topic
 * PUT		/topics/id		Updates the topic
 * DELETE	/topics/id		Deletes the topic
 * */


@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(CourseApiApp.class, args);
		
	}

}
