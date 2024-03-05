package com.faultmanagment.managerservice.model.user;


import com.faultmanagment.managerservice.model.Apartment;
import com.faultmanagment.managerservice.model.base.BaseUserInfo;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "u_home_owner")
public class HomeOwnerInfo extends BaseUserInfo {
    @OneToOne(cascade = CascadeType.ALL)
    private Apartment apartment;



}
