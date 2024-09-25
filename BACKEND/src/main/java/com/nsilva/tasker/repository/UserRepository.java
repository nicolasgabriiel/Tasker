package com.nsilva.tasker.repository;

import com.nsilva.tasker.entities.Task;
import com.nsilva.tasker.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
