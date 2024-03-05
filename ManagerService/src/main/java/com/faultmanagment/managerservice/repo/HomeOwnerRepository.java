package com.faultmanagment.managerservice.repo;

import com.faultmanagment.managerservice.model.user.HomeOwnerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HomeOwnerRepository extends JpaRepository<HomeOwnerInfo, UUID> {
}
