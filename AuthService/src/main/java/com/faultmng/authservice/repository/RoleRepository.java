package com.faultmng.authservice.repository;

import com.faultmng.authservice.enums.EnumRole;
import com.faultmng.authservice.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<UserRole, UUID> {
    UserRole findByRoleName(EnumRole enumRole);
}
