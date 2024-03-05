package com.faultmanagment.managerservice.dto;

import com.faultmanagment.managerservice.model.Apartment;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class HomeOwnerInfoDTO {
    private String firstName;
    private String lastName;
    private String phone;
    private String eMail;
    private ApartmentDTO apartment;

}
