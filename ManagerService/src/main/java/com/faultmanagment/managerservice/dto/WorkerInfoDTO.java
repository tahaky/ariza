package com.faultmanagment.managerservice.dto;

import lombok.Data;

@Data
public class WorkerInfoDTO  {
    private String firstName;
    private String lastName;
    private String phone;
    private String eMail;
    private WorkerResponsibilityDTO responsibility;
}
