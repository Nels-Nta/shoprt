package com.ntabana.shopritebackend.user;

public class AuthenticationResponse {

    private String token;
    private String message;
    private String role;

    public AuthenticationResponse(String token, String message, String role) {
        this.token = token;
        this.message = message;
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public String getMessage() {
        return message;
    }

   public String getRole() { return role; }
}
