package com.mynk.blogsheet.controller;

import com.mynk.blogsheet.dto.ApiResponse;
import com.mynk.blogsheet.dto.LoginDTO;
import com.mynk.blogsheet.dto.RegisterResponse;
import com.mynk.blogsheet.dto.UserDTO;
import com.mynk.blogsheet.models.User;
import com.mynk.blogsheet.services.JwtService;
import com.mynk.blogsheet.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @PostMapping("/register")
    public ResponseEntity<ApiResponse<RegisterResponse>> registerUser(@Valid @RequestBody UserDTO userDTO) {
        System.out.println("Registering user");
        System.out.println(userDTO);
        User registeredUser = userService.registerUser(userDTO);
        RegisterResponse response = new RegisterResponse(registeredUser.getId());
        return ResponseEntity.ok(ApiResponse.success(response, "User registration successful"));
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<Map<String, String>>> login(@Valid @RequestBody LoginDTO loginDTO) {
        System.out.println("Registering user");
        System.out.println(loginDTO);
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(loginDTO.getUsername(), loginDTO.getPassword())
        );

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String token = jwtService.generateToken(userDetails);

        Map<String, String> data = new HashMap<>();
        data.put("token", token);

        return ResponseEntity.ok(ApiResponse.success(data, "Login successful"));
    }
}
