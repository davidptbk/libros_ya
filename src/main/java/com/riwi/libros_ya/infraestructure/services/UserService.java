package com.riwi.libros_ya.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riwi.libros_ya.api.dto.request.UserReq;
import com.riwi.libros_ya.api.dto.response.UserResp;
import com.riwi.libros_ya.domain.entities.UserEntity;
import com.riwi.libros_ya.domain.repositories.UserRepository;
import com.riwi.libros_ya.infraestructure.abstract_services.IUserService;
import com.riwi.libros_ya.infraestructure.helpers.mapers.UserMapper;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService implements IUserService{
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public UserResp create(UserReq request) {
        UserEntity userEntity = this.userMapper.toEntity(request);
        return this.userMapper.toResponse(this.userRepository.save(userEntity));
    }

    @Override
    public UserResp get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public UserResp update(UserReq request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
