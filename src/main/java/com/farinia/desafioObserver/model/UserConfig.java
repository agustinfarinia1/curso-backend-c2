package com.farinia.desafioObserver.model;

public class UserConfig {
    private String rol;
    private String email;
    private String phone;

    public UserConfig(){
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "{" + "rol='" + rol + '\'' + ", email='" + email + '\'' +
                ", phone='" + phone + '\'' + '}';
    }
}
