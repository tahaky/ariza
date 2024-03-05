package com.faultmng.authservice.service;

import com.faultmng.authservice.enums.EnumRole;
import com.faultmng.authservice.model.UserInfo;
import com.faultmng.authservice.model.UserRole;
import com.faultmng.authservice.repository.RoleRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Getter
public class UserRoleService implements IUserRoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public UserRoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Override
    public UserRole findByRoleName(EnumRole enumRole) {
        return this.roleRepository.findByRoleName(enumRole);
    }

    @Override
    public void save(EnumRole enumRole) {
        UserRole role = new UserRole(enumRole);
        this.roleRepository.save(role);
    }
}
