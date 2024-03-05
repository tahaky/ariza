package com.faultmanagment.managerservice.service;

import com.faultmanagment.managerservice.dto.HomeOwnerInfoDTO;
import com.faultmanagment.managerservice.dto.WorkerInfoDTO;
import com.faultmanagment.managerservice.model.user.HomeOwnerInfo;
import com.faultmanagment.managerservice.model.user.WorkerInfo;
import org.springframework.http.ResponseEntity;

public interface IWorkerService {
    ResponseEntity<WorkerInfo> createWorkerInfo(WorkerInfoDTO workerInfoDTO);

}
