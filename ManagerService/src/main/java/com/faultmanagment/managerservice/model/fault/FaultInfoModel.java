package com.faultmanagment.managerservice.model.fault;

import com.faultmanagment.managerservice.model.Apartment;
import com.faultmanagment.managerservice.model.base.BaseModel;
import com.faultmanagment.managerservice.model.user.WorkerInfo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "fault_info_model")
public class FaultInfoModel extends BaseModel {

    @ManyToMany
    @JoinTable(
            name = "fault_to_type",
            joinColumns = {@JoinColumn(name = "fault_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "fault_type_id", referencedColumnName = "id")}
    )
    private Set<FaultType> faultType;

    @ManyToMany
    @JoinTable(
            name = "fault_to_worker",
            joinColumns = {@JoinColumn(name = "fault_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "worker_id", referencedColumnName = "id")}
    )
    private Set<WorkerInfo> responsible;

    @ManyToOne
    @JoinColumn(name = "apartment_id",referencedColumnName = "id")
    private Apartment faultOwner;

    private LocalDateTime createdDay = LocalDateTime.now();
    private LocalDateTime deadline;


}
