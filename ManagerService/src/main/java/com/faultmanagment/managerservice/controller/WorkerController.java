package com.faultmanagment.managerservice.controller;

import com.faultmanagment.managerservice.dto.HomeOwnerInfoDTO;
import com.faultmanagment.managerservice.dto.WorkerInfoDTO;
import com.faultmanagment.managerservice.model.user.HomeOwnerInfo;
import com.faultmanagment.managerservice.model.user.WorkerInfo;
import com.faultmanagment.managerservice.service.WorkerInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/wrk")
@RequiredArgsConstructor
public class WorkerController {

    private final WorkerInfoService workerInfoService;

    @PostMapping("/")
    ResponseEntity<WorkerInfo> create(@RequestBody WorkerInfoDTO workerInfoDTO){
        return this.workerInfoService.createWorkerInfo(workerInfoDTO);
    }
}
