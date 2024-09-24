package com.nsilva.tasker.repository;
import com.nsilva.tasker.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
