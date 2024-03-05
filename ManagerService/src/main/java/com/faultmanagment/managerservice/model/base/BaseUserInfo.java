package com.faultmanagment.managerservice.model.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class BaseUserInfo extends BaseModel {
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_Name")
    private String lastName;
    @Column(name = "phone")
    private String phone;
    @Column(name = "e_mail")
    private String eMail;


}
