package com.faultmng.authservice.controller;

import com.faultmng.authservice.dto.LoginDto;
import com.faultmng.authservice.enums.EnumUserLog;
import com.faultmng.authservice.jwt.JwtService;
import com.faultmng.authservice.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("v1/user-service")
@RequiredArgsConstructor
public class UserController {
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    @PostMapping("/login")
    ResponseEntity<String> login(@RequestBody LoginDto loginDto) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginDto.getPhone(),
                        loginDto.getPassword()
                )
        );
        System.err.println(this.jwtService.GenerateToken(loginDto.getPhone()));
        return new ResponseEntity<String>(
                EnumUserLog.USER_CREATED_SUCCESSFULLY.getResponseBody(),
                HttpStatus.OK
                );
    }


}
