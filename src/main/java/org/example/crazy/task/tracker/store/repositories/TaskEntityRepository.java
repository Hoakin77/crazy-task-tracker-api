package org.example.crazy.task.tracker.store.repositories;

import org.example.crazy.task.tracker.store.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskEntityRepository extends JpaRepository<TaskEntity, Long> {
}
