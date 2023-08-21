package com.charoldev.security.service;

import com.charoldev.security.dto.AuthRequestDTO;
import com.charoldev.security.dto.AuthResponseDTO;
import com.charoldev.security.dto.RegisterRequestDTO;

public interface AuthService {
    AuthResponseDTO register(RegisterRequestDTO request);
    AuthResponseDTO authenticate(AuthRequestDTO request);

}
