package com.riwi.libros_ya.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.libros_ya.api.dto.request.UserReq;
import com.riwi.libros_ya.api.dto.response.UserResp;
import com.riwi.libros_ya.infraestructure.abstract_services.IUserService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/users")
@AllArgsConstructor
public class UserController implements GenericController<UserReq,UserResp,Long> {
    @Autowired
    IUserService userService;

    @Operation(summary = "Create a user", description = "You must send the username, password, email, fullname and role")
    @Override
    @PostMapping
    public ResponseEntity<UserResp> create(@RequestBody UserReq request) {
        return ResponseEntity.ok(this.userService.create(request));
    }

    @Override
    public ResponseEntity<UserResp> get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public ResponseEntity<UserResp> update(UserReq request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
