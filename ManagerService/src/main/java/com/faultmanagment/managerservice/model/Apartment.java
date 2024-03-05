package com.faultmanagment.managerservice.model;

import com.faultmanagment.managerservice.enums.EnumApartmentBlock;
import com.faultmanagment.managerservice.enums.EnumApartmentNumber;
import com.faultmanagment.managerservice.model.base.BaseModel;
import com.faultmanagment.managerservice.model.fault.FaultInfoModel;
import com.faultmanagment.managerservice.model.user.HomeOwnerInfo;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
@Table(name = "apartment")
public class Apartment extends BaseModel {

    @Column(unique = true)
    private EnumApartmentNumber apartmentNumber;
    @Column(unique = true)
    private EnumApartmentBlock apartmentBlock;

    @OneToOne(mappedBy = "apartment")
    private HomeOwnerInfo homeOwnerInfo;

    @OneToMany(mappedBy = "faultOwner")
    private Set<FaultInfoModel> fault;


}
