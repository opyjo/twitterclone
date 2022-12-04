package com.cst8277.ums.ojo.johnson.data.payloads.request;

import com.cst8277.ums.ojo.johnson.data.models.Role;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

public class UserRequest {

    @NotBlank
    @NotNull
    private String email;

    @NotBlank
    @NotNull
    private String name;

    @NotBlank
    @Null
    private String is_active;

    @NotBlank
    @NotNull
    private String password;


    @NotBlank
    @NotNull
    @Enumerated(EnumType.STRING)
    private Role role;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIs_active() {
        return is_active;
    }

    public void setIs_active(String is_active) {
        this.is_active = is_active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}



