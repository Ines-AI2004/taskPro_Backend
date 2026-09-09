package com.example.demo.controller;

import com.example.demo.model.dto.TaskDTO;
import com.example.demo.model.entity.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(
        origins = {
                "http://localhost:5173",
                "https://task-managment-system-g6eh.vercel.app"
        },
        allowedHeaders = "*",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS}
)
@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/get-task")
    public TaskDTO getUser(@RequestParam Integer id){
        return taskService.getTaskRepo(id);

    }
    @PostMapping("/save-task")
    public Task saveUser(@RequestBody Task task){
        return taskService.saveTask(task);

    }
    @PutMapping("/update-task")
    public TaskDTO upadteUser(@RequestBody TaskDTO emp){
        return TaskDTO.FromEntitytoDto(taskService.saveTask(Task.toEntity(emp)));

    }
    @DeleteMapping("/delete-task")
    public void deleteUser(@RequestParam Integer id){
        taskService.deleteTask(id);


    }
}
