package org.example.crazy.task.tracker.api.factories;

import org.example.crazy.task.tracker.api.dto.ProjectDto;
import org.example.crazy.task.tracker.store.entities.ProjectEntity;
import org.springframework.stereotype.Component;

@Component
public class ProjectDtoFactory {

    public ProjectDto makeProjectDto(ProjectEntity entity) {

        return ProjectDto.builder().
                id(entity.getId()).
                name(entity.getName()).
                CreatedAt(entity.getCreatedAt()).
                updatedAt(entity.getUpdateAt()).
                build();


    }
}
