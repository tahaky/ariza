package com.faultmng.authservice.jwt;

import com.faultmng.authservice.model.UserInfo;
import com.faultmng.authservice.model.UserRole;
import com.faultmng.authservice.repository.UserInfoRepository;
import com.faultmng.authservice.service.UserInfoService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Getter
@Component
public class JwtUserDetailService implements UserDetailsService {
    private final UserInfoRepository userInfoRepository;

    @Autowired
    public JwtUserDetailService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo user = this.userInfoRepository.findByPhone(username);
        if (user == null) {
            throw new UsernameNotFoundException("ABOO");
        } else {
            return new JwtUserInfoDetail(user);
        }
    }
}
