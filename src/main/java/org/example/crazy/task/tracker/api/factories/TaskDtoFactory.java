package org.example.crazy.task.tracker.api.factories;

import org.example.crazy.task.tracker.api.dto.TaskDto;
import org.example.crazy.task.tracker.store.entities.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoFactory {

    public TaskDto makeTaskDto(TaskEntity entity){
        return TaskDto.builder().
                id(entity.getId()).
                name(entity.getName()).
                CreatedAt(entity.getCreatedAt()).
                description(entity.getDescription())
                .build();
    }

}
