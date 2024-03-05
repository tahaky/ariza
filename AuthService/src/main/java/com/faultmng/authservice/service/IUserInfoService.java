package com.faultmng.authservice.service;

import com.faultmng.authservice.model.UserInfo;

public interface IUserInfoService {
    UserInfo findByPhone(String phone);

}