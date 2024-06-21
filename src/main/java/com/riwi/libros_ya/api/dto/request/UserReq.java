package com.riwi.libros_ya.api.dto.request;

import com.riwi.libros_ya.Util.enums.Rol;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserReq {
    @NotBlank(message = "The username is required")
    @Size(max = 50, message = "The maximum characters in username is 50")
    private String username;
    @NotBlank(message = "The user password user is required")
    @Size(max = 100,message = "The maximum characters is 50")
    private String password;
    @NotBlank(message = "The email is required")
    @Email(message = "The email must be a valid email [example@example.com]")
    @Size(max = 100, message = "The carachters maximum in email is 100")
    private String email;
    @NotBlank(message = "The user fullname is required")
    @Size(max = 100, message = "The length of the name should not exceed 100 characters.")
    private String fullName;
    @NotBlank(message = "The user rol is required")
    private Rol role;

}
