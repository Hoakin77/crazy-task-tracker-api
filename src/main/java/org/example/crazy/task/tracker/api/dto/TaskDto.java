package org.example.crazy.task.tracker.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskDto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;


    private String name;

    @JsonProperty("created_at")
    Instant CreatedAt;


    private String description;
}
