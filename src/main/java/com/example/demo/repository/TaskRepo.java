package com.example.demo.repository;

import com.example.demo.model.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Integer> {

}
