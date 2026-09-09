package com.example.demo.model.dto;

import com.example.demo.model.entity.Task;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public  class TaskDTO {
    private Integer id;
    private  String title;
    private  String description;
    private Boolean compeleted;

    public static TaskDTO FromEntitytoDto(Task entity){
        return TaskDTO.builder().id(entity.getId()).title(entity.getTitle()).description(entity.getDescription()).compeleted(entity.getCompleted()).build();
    }
}
