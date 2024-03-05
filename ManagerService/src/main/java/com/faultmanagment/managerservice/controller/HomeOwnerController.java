package com.faultmanagment.managerservice.controller;

import com.faultmanagment.managerservice.dto.HomeOwnerInfoDTO;
import com.faultmanagment.managerservice.model.user.HomeOwnerInfo;
import com.faultmanagment.managerservice.service.HomeOwnerInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/hmw")
public class HomeOwnerController {
    private final HomeOwnerInfoService homeOwnerInfoService;


    @PostMapping("/")
    ResponseEntity<HomeOwnerInfo> create(@RequestBody HomeOwnerInfoDTO homeOwnerInfoDTO){
        return this.homeOwnerInfoService.createHomeOwner(homeOwnerInfoDTO);
    }
}
