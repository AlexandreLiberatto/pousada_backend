package com.phegondev.PhegonHotel.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

    @NotBlank(message = "E-mail é obrigatório!")
    private String email;
    @NotBlank(message = "A senha é obrigatória!")
    private String password;
}
