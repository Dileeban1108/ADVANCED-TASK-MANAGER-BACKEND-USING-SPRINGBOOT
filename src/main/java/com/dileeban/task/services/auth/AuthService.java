package com.dileeban.task.services.auth;

import com.dileeban.task.dto.SignupRequest;
import com.dileeban.task.dto.UserDto;

public interface AuthService {

    UserDto signupUser(SignupRequest signupRequest);

    boolean hasUserWithEmail(String email);
}
