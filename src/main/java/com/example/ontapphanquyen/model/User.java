package com.example.ontapphanquyen.model;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Entity
//@Getter
//@Setter
@RequiredArgsConstructor
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public int number=40;
    private String username;

    private String password;

    private String role;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) {
        User user=new User();
        System.out.println(user.number);
        System.out.println(user.username);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (!StringUtils.hasText(this.role))
            return Collections.emptyList();

        GrantedAuthority authority = new SimpleGrantedAuthority(role);
        return Collections.singleton(authority);
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
