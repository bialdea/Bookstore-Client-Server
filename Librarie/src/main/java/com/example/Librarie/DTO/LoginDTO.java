package com.example.Librarie.DTO;

public class LoginDTO {
    private String username;
    private String parola;

    public LoginDTO() {}

    public LoginDTO(String username, String parola) {
        this.username = username;
        this.parola = parola;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return parola;
    }

    public void setPassword(String parola) {
        this.parola = parola;
    }
}
