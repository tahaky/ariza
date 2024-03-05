package com.faultmng.authservice.model;

import com.faultmng.authservice.enums.EnumRole;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "role")
public class UserRole extends BaseModel {

    @ManyToMany(mappedBy = "userRole",cascade = CascadeType.ALL)
    private List<UserInfo> userInfos = new ArrayList<>();
    @Enumerated(EnumType.STRING)
    private EnumRole roleName;

    public UserRole(EnumRole enumRole){
        this.roleName= enumRole;
    }
}
