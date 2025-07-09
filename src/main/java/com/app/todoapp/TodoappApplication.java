
package com.app.todoapp;

import com.app.todoapp.models.Task;
import com.app.todoapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EntityScan(basePackages = "com.app.todoapp.models")
public class TodoappApplication implements CommandLineRunner {

	@Autowired
	private TaskRepository taskRepository;
	public static void main(String[] args) {
		SpringApplication.run(TodoappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		List<String>tasks=new  ArrayList<String>(List.of("sagar","niroj","nawaaj"));
//		for (String task:tasks){
//			Task task1=Task.builder()
//					.title(task)
//					.completed(false)
//					.build();
//			taskRepository.save(task1);
//		}
	}
}
