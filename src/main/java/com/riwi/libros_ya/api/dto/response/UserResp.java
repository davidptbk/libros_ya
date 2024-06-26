package com.riwi.libros_ya.api.dto.response;

import com.riwi.libros_ya.Util.enums.Rol;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class UserResp {
    private Long id;
    private String userName;
    private String password;
    private String email;
    private String fullName;
    private Rol role;
}
