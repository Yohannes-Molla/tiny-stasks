package com.coyoapp.tinytask.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Null;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskRequest {

  @NotEmpty(message = "Please provide task name.")
  private String name;

  private String id;

  @NotEmpty(message = "User id must not empty!")
  private String userId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dueDate;

  private String detail;

  private boolean done;

}
