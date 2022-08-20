package org.example.crazy.task.tracker.store.entities;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "project")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private String name;

    @Builder.Default
    private Instant updateAt = Instant.now();

    @Builder.Default
    private Instant createdAt = Instant.now();

    @Builder.Default
    @OneToMany
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    private List<TaskStateEntity> taskStates = new ArrayList<>();






}


