package com.faultmanagment.managerservice.service;
import com.faultmanagment.managerservice.dto.WorkerInfoDTO;
import com.faultmanagment.managerservice.enums.EnumWorker;
import com.faultmanagment.managerservice.model.user.WorkerInfo;
import com.faultmanagment.managerservice.model.worker.WorkerResponsibility;
import com.faultmanagment.managerservice.repo.WorkerInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkerInfoService implements IWorkerService{
    private final WorkerInfoRepository workerInfoRepository;

    @Override
    public ResponseEntity<WorkerInfo> createWorkerInfo(WorkerInfoDTO workerInfoDTO) {
        WorkerInfo workerInfo = new WorkerInfo();
        WorkerResponsibility workerResponsibility = new WorkerResponsibility();
        try {
            workerResponsibility.setWorkerResponsible(workerInfoDTO.getResponsibility().getResponsibility());
            workerInfo.setFirstName(workerInfoDTO.getFirstName());
            workerInfo.setLastName(workerInfoDTO.getLastName());
            workerInfo.setPhone(workerInfoDTO.getPhone());
            workerInfo.setEMail(workerInfoDTO.getEMail());
            workerInfo.addNewResponsibilty(workerResponsibility);
            this.workerInfoRepository.save(workerInfo);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }    }
}
