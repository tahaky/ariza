package com.faultmanagment.managerservice.dto;

import com.faultmanagment.managerservice.enums.EnumWorker;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class WorkerResponsibilityDTO {
    @Enumerated(EnumType.STRING)
    private EnumWorker responsibility;

}
