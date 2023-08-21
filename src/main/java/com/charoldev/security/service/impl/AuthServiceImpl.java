package com.charoldev.security.service.impl;

import com.charoldev.security.dto.AuthRequestDTO;
import com.charoldev.security.dto.AuthResponseDTO;
import com.charoldev.security.dto.RegisterRequestDTO;
import com.charoldev.security.model.Role;
import com.charoldev.security.model.User;
import com.charoldev.security.repository.UserRepository;
import com.charoldev.security.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtServiceImpl jwtService;
    private final AuthenticationManager authenticationManager;
    @Override
    public AuthResponseDTO register(RegisterRequestDTO request) {
        var user = User.builder()
            .firstname(request.getFirstname())
            .lastname(request.getLastname())
            .email(request.getEmail())
            .password(passwordEncoder.encode(request.getPassword()))
            .role(Role.USER)
            .build();
        userRepository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthResponseDTO.builder()
            .token(jwtToken)
            .build();
    }

    @Override
    public AuthResponseDTO authenticate(AuthRequestDTO request) {
        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                request.getEmail(),
                request.getPassword()
            )
        );
        var user = userRepository.findByEmail(request.getEmail()).orElseThrow(    );
        return null;
    }
}
