package com.example.demo.service;

import com.example.demo.model.dto.TaskDTO;
import com.example.demo.model.entity.Task;
import com.example.demo.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepo taskRepo;

    public TaskDTO getTaskRepo(Integer id) {
        Optional<Task> emp=this.taskRepo.findById(id);
        return emp.map(TaskDTO::FromEntitytoDto).orElse(null);
//        return emp.orElse(null);
    }
    public Task saveTask(Task task){
        return this.taskRepo.save(task);

    }
    public void deleteTask(Integer id){
         this.taskRepo.deleteById(id);

    }
    public TaskDTO UpdateTask(TaskDTO task){
        return TaskDTO.FromEntitytoDto(taskRepo.save(Task.toEntity(task)));

    }



}
