package com.faultmng.authservice.service;

import com.faultmng.authservice.model.UserInfo;
import com.faultmng.authservice.repository.UserInfoRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Getter
public class UserInfoService implements IUserInfoService {
    private final UserInfoRepository userInfoRepository;


    @Autowired
    public UserInfoService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @Override
    public UserInfo findByPhone(String phone) {
        return this.userInfoRepository.findByPhone(phone);
    }



}
