package com.faultmanagment.managerservice.enums;

public enum EnumApartmentBlock {
    BLOCK_A('A'),
    BLOCK_B('B'),
    BLOCK_C('C');
    private final char value;

    EnumApartmentBlock(char value) {
        this.value = value;
    }
}
