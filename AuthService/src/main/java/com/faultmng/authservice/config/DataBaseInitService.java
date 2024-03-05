package com.faultmng.authservice.config;

import com.faultmng.authservice.enums.EnumRole;
import com.faultmng.authservice.model.UserInfo;
import com.faultmng.authservice.model.UserRole;
import com.faultmng.authservice.repository.UserInfoRepository;
import com.faultmng.authservice.service.UserInfoService;
import com.faultmng.authservice.service.UserRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataBaseInitService {
    private final UserRoleService roleService;
    private final PasswordEncoder bCryptPasswordEncoder;
    private final UserInfoRepository userInfoService;

    @EventListener
    void OnProjectRun(AvailabilityChangeEvent<ReadinessState> event) {
        UserRole firstRequestForDbCheck = roleService.findByRoleName(EnumRole.ADMIN);
        UserInfo userInfo = new UserInfo();
        userInfo.setFirstName("TAHA");
        userInfo.setLastName("KAYA");
        userInfo.setEMail("tahakaya36@hotmail.com");
        userInfo.setPhone("05347197634");
        userInfo.setPassword(bCryptPasswordEncoder.encode("123"));
        userInfo.addNewRole(firstRequestForDbCheck);
        ReadinessState state = event.getState();
        if (state == ReadinessState.ACCEPTING_TRAFFIC && firstRequestForDbCheck == null) {
            roleService.save(EnumRole.MANAGER);
            roleService.save(EnumRole.ADMIN);
            roleService.save(EnumRole.NORMAL_USER);
            userInfoService.save(userInfo);
        }

    }
}
