package com.nsilva.tasker.services;

import com.nsilva.tasker.entities.Task;
import com.nsilva.tasker.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public List<Task> findAll() {
        return repository.findAll();
    }

    public Optional<Task> findById(Long id) {
       return repository.findById(id);
    }

    public Task insert(Task obj) {
        return repository.save(obj);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
    public Task update(Long id, Task obj) {
        Task entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }
    private void updateData(Task entity, Task obj) {
       entity.setDescription(obj.getDescription());

    }
}