package com.faultmanagment.managerservice.service;

import com.faultmanagment.managerservice.dto.HomeOwnerInfoDTO;
import com.faultmanagment.managerservice.model.user.HomeOwnerInfo;
import org.springframework.http.ResponseEntity;

public interface IHomeOwnerInfoService {
   ResponseEntity<HomeOwnerInfo> createHomeOwner(HomeOwnerInfoDTO homeOwnerInfoDTO);

}
