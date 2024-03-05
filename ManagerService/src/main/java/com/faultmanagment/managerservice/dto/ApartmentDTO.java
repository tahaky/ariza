package com.faultmanagment.managerservice.dto;

import com.faultmanagment.managerservice.enums.EnumApartmentBlock;
import com.faultmanagment.managerservice.enums.EnumApartmentNumber;
import lombok.Data;

@Data
public class ApartmentDTO {
    private EnumApartmentNumber apartmentNumber;
    private EnumApartmentBlock apartmentBlock;

}
