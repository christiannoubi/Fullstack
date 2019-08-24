package de.adorsys.employee.domain;

public class LoginResponse {
    private boolean successfulLogged;

    public LoginResponse() {}

    public LoginResponse(boolean successfulLogged) {
        this.successfulLogged = successfulLogged;
    }

    public boolean isSuccessfulLogged() {
        return successfulLogged;
    }

    public void setSuccessfulLogged(boolean successfulLogged) {
        this.successfulLogged = successfulLogged;
    }
}
