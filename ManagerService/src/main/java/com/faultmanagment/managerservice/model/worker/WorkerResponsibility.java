package com.faultmanagment.managerservice.model.worker;

import com.faultmanagment.managerservice.enums.EnumWorker;
import com.faultmanagment.managerservice.model.base.BaseModel;
import com.faultmanagment.managerservice.model.user.WorkerInfo;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Data
@Table(name="worker_responsibilities")
public class WorkerResponsibility extends BaseModel {
    @Enumerated(EnumType.STRING)
    private EnumWorker workerResponsible;

    @ManyToMany(mappedBy = "workerResponsibilities")
    private Set<WorkerInfo> worker;
}
