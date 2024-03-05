package com.faultmng.authservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumUserLog {

    USER_CREATED_SUCCESSFULLY("RESPONSE","USER LOGIN","USER IS SUCCESSFULLY LOGIN IN")
    ;



    private final String ResponseHeaderName;
    private final String ResponseHeader;
    private final String ResponseBody;




}
