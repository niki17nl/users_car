package com.users_car.controller;

import com.users_car.model.UserResponse;
import com.users_car.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@Tag(name = "User API")
@RestController
@RequestMapping("v1/users")
@RequiredArgsConstructor
@SecurityRequirement(name = "users-car")
public class UserController {

    private final UserService userService;

    @GetMapping()
    @Operation(description = "Get users")
    public List<UserResponse> getUsers() throws IOException {
        return userService.getUsers();
    }
}
