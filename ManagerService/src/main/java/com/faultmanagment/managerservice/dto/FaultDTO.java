package com.faultmanagment.managerservice.dto;

import com.faultmanagment.managerservice.model.Apartment;
import com.faultmanagment.managerservice.model.fault.FaultType;
import com.faultmanagment.managerservice.model.user.WorkerInfo;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;
@Data
public class FaultDTO {
    private Set<FaultType> faultType;
    private Set<WorkerInfo> responsible;
    private Apartment faultOwner;
    private LocalDateTime createdDay;
    private LocalDateTime deadline;
}
