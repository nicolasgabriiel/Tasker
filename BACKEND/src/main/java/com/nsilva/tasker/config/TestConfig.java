package com.nsilva.tasker.config;

import com.nsilva.tasker.entities.Task;
import com.nsilva.tasker.entities.enums.TaskPriority;
import com.nsilva.tasker.repository.TaskRepository;
import com.nsilva.tasker.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
    @Profile("dev")
public class TestConfig implements CommandLineRunner{

        @Autowired
        private TaskRepository repository;

        @Override
        public void run(String... args) throws Exception {


         Task task1 = new Task(null, "Titulo", "Descrição", TaskPriority.valueOf("URGENT"));
         Task task2 = new Task(null, "Titulo", "Descrição", TaskPriority.valueOf("URGENT"));
         Task task3 = new Task(null, "Titulo", "Descrição", TaskPriority.valueOf("URGENT"));


            repository.saveAll(Arrays.asList(task1, task2,task3));

        }
    }
