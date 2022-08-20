package org.example.crazy.task.tracker.store.entities;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;


@Setter
@Getter
@Entity
@Table(name = "task")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private String name;

    @Builder.Default
    private Instant createdAt = Instant.now();

    private String description;
}
