package com.faultmng.authservice.jwt;

import com.faultmng.authservice.model.UserInfo;
import com.faultmng.authservice.model.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JwtUserInfoDetail extends UserInfo implements UserDetails {

    private String phoneNumber;
    private String password;
    Collection<? extends GrantedAuthority> authorities;

    public JwtUserInfoDetail(UserInfo userInfo) {
        this.phoneNumber= userInfo.getPhone();
        this.password= userInfo.getPassword();
        List<GrantedAuthority> tempAuth = new ArrayList<>();
        for(UserRole role: userInfo.getUserRole()){
            tempAuth.add(new SimpleGrantedAuthority(role.getRoleName().toString().toUpperCase()));
        }
        this.authorities=tempAuth;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return phoneNumber;
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
