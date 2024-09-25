package com.nsilva.tasker.entities;

import com.nsilva.tasker.entities.enums.TaskPriority;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "tb_task")
public class Task {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter @Setter
    private String title;
    @Getter @Setter
    private String description;
    @Getter @Setter
    private TaskPriority priority;

    public Task(){}

    public Task(Long id, String title, String description, TaskPriority priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
