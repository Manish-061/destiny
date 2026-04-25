package com.manish.usermanagement.controller;

import com.manish.usermanagement.dto.UserRequestDTO;
import com.manish.usermanagement.dto.UserResponseDTO;
import com.manish.usermanagement.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(@Valid @RequestBody UserRequestDTO request) {
//        return ResponseEntity.ok(userService.createUser(request));
        UserResponseDTO response = userService.createUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> getAllUsers() {
//        return ResponseEntity.ok(userService.getAllUsers());
        List<UserResponseDTO> response = userService.getAllUsers();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }


    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> getUser(@PathVariable Long id) {
//        return ResponseEntity.ok(userService.getUserById(id));
        UserResponseDTO response = userService.getUserById(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }


    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDTO> updateUser(@PathVariable Long id, @Valid @RequestBody UserRequestDTO request) {
//        return ResponseEntity.ok(userService.updateUser(id, request));
        UserResponseDTO response = userService.updateUser(id, request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UserResponseDTO> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
//        return ResponseEntity.ok().build();
        return ResponseEntity.status(HttpStatus.OK).body(new UserResponseDTO());
    }
}
