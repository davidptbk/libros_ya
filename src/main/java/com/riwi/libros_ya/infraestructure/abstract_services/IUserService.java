package com.riwi.libros_ya.infraestructure.abstract_services;

import com.riwi.libros_ya.api.dto.request.UserReq;
import com.riwi.libros_ya.api.dto.response.UserResp;

public interface IUserService extends CrudService<UserReq,UserResp, Long> {
    
}
