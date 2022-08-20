package org.example.crazy.task.tracker.store.entities;


import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "task_state")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class TaskStateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToOne
    TaskStateEntity leftTaskState;

    @OneToOne
    TaskStateEntity rightTaskState;

    @Builder.Default
    Instant createdAt = Instant.now();

    @ManyToOne
    ProjectEntity project;

    @Builder.Default
    @OneToMany
    @JoinColumn(name = "task_state_id", referencedColumnName = "id")
    List<TaskEntity> tasks = new ArrayList<>();

    public Optional<TaskStateEntity> getLeftTaskState() {
        return Optional.ofNullable(leftTaskState);
    }

    public Optional<TaskStateEntity> getRightTaskState() {
        return Optional.ofNullable(rightTaskState);
    }
}
