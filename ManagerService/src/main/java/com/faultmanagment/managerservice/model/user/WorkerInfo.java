package com.faultmanagment.managerservice.model.user;

import com.faultmanagment.managerservice.enums.EnumWorker;
import com.faultmanagment.managerservice.model.base.BaseUserInfo;
import com.faultmanagment.managerservice.model.fault.FaultInfoModel;
import com.faultmanagment.managerservice.model.worker.WorkerResponsibility;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="u_worker_info")
public class WorkerInfo extends BaseUserInfo {
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "worker-to-responsibilities",
            joinColumns = {@JoinColumn(name = "worker_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "responsibilities_id",referencedColumnName = "id")}
    )
    private Set<WorkerResponsibility> workerResponsibilities = new HashSet<>();

    public void addNewResponsibilty(WorkerResponsibility resp){
       this.workerResponsibilities.add(resp);

    }
}
