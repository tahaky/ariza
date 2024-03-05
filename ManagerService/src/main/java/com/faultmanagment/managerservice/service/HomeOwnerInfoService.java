package com.faultmanagment.managerservice.service;

import com.faultmanagment.managerservice.dto.HomeOwnerInfoDTO;
import com.faultmanagment.managerservice.model.Apartment;
import com.faultmanagment.managerservice.model.user.HomeOwnerInfo;
import com.faultmanagment.managerservice.repo.HomeOwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HomeOwnerInfoService implements IHomeOwnerInfoService {
    private final HomeOwnerRepository homeOwnerRepository;
    @Override
    public ResponseEntity<HomeOwnerInfo> createHomeOwner(HomeOwnerInfoDTO homeOwnerInfoDTO) {
        HomeOwnerInfo homeOwnerInfo;
        try {
            Apartment apartment= new Apartment();
            apartment.setApartmentBlock(homeOwnerInfoDTO.getApartment().getApartmentBlock());
            apartment.setApartmentNumber(homeOwnerInfoDTO.getApartment().getApartmentNumber());
            homeOwnerInfo = new HomeOwnerInfo();
            homeOwnerInfo.setFirstName(homeOwnerInfoDTO.getFirstName());
            homeOwnerInfo.setLastName(homeOwnerInfoDTO.getLastName());
            homeOwnerInfo.setPhone(homeOwnerInfoDTO.getPhone());
            homeOwnerInfo.setEMail(homeOwnerInfoDTO.getEMail());
            homeOwnerInfo.setPhone(homeOwnerInfoDTO.getPhone());
            homeOwnerInfo.setApartment(apartment);
            this.homeOwnerRepository.save(homeOwnerInfo);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
