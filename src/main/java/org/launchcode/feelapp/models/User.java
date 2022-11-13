package org.launchcode.feelapp.models;

import com.sun.istack.NotNull;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import javax.validation.constraints.NotNull;


import javax.persistence.Entity;

@Entity
public class User {

    @NotNull
    private String username;

    @NotNull
    private String pwHash;

    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.pwHash = password;
    }

    public String getUsername() {
        return username;
    }
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }

    public Object getId() {
        return null;
    }
}
