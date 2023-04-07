package com.users_car.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserResponse {
    private Long userId;
    private String name;
    private List<CarResponse> car;

}
