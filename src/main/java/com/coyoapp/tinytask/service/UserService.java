package com.coyoapp.tinytask.service;

import com.coyoapp.tinytask.dto.UserRequest;
import com.coyoapp.tinytask.dto.UserResponse;

import java.util.List;

public interface UserService {

  List<UserResponse> getAllUsers();

  UserResponse getUser(String id);

  UserResponse createUser(UserRequest userRequest);

  UserResponse updateUser(UserRequest userRequest, String userId);

  void deleteUser(String userId);
}
