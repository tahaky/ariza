package com.faultmanagment.managerservice.repo;

import com.faultmanagment.managerservice.model.user.WorkerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WorkerInfoRepository extends JpaRepository<WorkerInfo, UUID> {
}
