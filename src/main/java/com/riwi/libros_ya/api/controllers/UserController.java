package com.riwi.libros_ya.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.riwi.libros_ya.api.dto.request.UserReq;
import com.riwi.libros_ya.api.dto.response.UserResp;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class UserController implements GenericController<UserReq,UserResp,Long> {
    @Autowired
    

    @Override
    public ResponseEntity<UserResp> create(UserReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
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
