package ru.kemova.planning_task_project_M2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PlanningTaskProjectM2Application {

	public static void main(String[] args) {
		SpringApplication.run(PlanningTaskProjectM2Application.class, args);
	}

}
