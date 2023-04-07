package com.users_car.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.users_car.model.UserResponse;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserService {

    private final ObjectMapper objectMapper;

    public List<UserResponse> getUsers() throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStreamUser = classloader.getResourceAsStream("userData.json");

        if (Objects.isNull(inputStreamUser)) {
            return null;
        }
        String result = IOUtils.toString(inputStreamUser, StandardCharsets.UTF_8);

        return objectMapper.readValue(result, new TypeReference<>() {
        });
    }
}
