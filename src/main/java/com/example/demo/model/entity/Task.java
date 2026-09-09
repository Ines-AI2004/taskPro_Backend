package com.example.demo.model.entity;

import com.example.demo.model.dto.TaskDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="tasks")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="task_id")
    private Integer id;
    @Column(name="title")
    private  String title;
    @Column(name="description")
    private  String description;
    @Column(name="completed")
    private Boolean completed;

    public static Task toEntity(TaskDTO task){
        return Task.builder().id(task.getId()).title(task.getTitle()).description(task.getDescription()).
                completed(task.getCompeleted()).build();


    }


}
