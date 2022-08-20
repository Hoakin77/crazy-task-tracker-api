package org.example.crazy.task.tracker.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;


import javax.persistence.*;
import java.time.Instant;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectDto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @NonNull
    String name;

    @NonNull
    @JsonProperty("created_at")
    Instant CreatedAt;

    @NonNull
    @JsonProperty("updated_at")
    Instant updatedAt;


}
