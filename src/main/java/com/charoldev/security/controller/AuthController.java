package com.charoldev.security.controller;

import com.charoldev.security.dto.AuthRequestDTO;
import com.charoldev.security.dto.AuthResponseDTO;
import com.charoldev.security.dto.RegisterRequestDTO;
import com.charoldev.security.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    @PostMapping("/register")
    public ResponseEntity<AuthResponseDTO> register(
        @RequestBody RegisterRequestDTO request
    ) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthResponseDTO> authenticate(
        @RequestBody AuthRequestDTO request
    ) {
        return ResponseEntity.ok(authService.authenticate(request));
    }
}
