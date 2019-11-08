package com.coyoapp.tinytask.service;

import com.coyoapp.tinytask.dto.TaskRequest;
import com.coyoapp.tinytask.dto.TaskResponse;
import java.util.List;

public interface TaskService {

  List<TaskResponse> getAllTasks();

  TaskResponse getTask(String id);

  TaskResponse createTask(TaskRequest taskRequest);

  TaskResponse updateTask(TaskRequest taskRequest, String taskId);

  void deleteTask(String taskId);

}
