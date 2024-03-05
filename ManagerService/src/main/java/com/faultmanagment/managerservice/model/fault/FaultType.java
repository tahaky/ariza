package com.faultmanagment.managerservice.model.fault;

import com.faultmanagment.managerservice.enums.EnumFaultType;
import com.faultmanagment.managerservice.model.base.BaseModel;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "fault_type")
public class FaultType extends BaseModel {

    @Enumerated(EnumType.STRING)
    private EnumFaultType faultTypeName;

    @ManyToMany(mappedBy = "faultType")
    private Set<FaultInfoModel> fault;
}
