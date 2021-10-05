package com.shams.simbir.controller.auth;

import lombok.Data;

@Data
public class AuthenticationRequestDTO {
    private String login;
    private String password;

}
