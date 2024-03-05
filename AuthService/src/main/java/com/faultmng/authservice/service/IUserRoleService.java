package com.faultmng.authservice.service;

import com.faultmng.authservice.enums.EnumRole;
import com.faultmng.authservice.model.UserRole;

public interface IUserRoleService {

    UserRole findByRoleName(EnumRole enumRole);
    void save(EnumRole enumRole);

}
