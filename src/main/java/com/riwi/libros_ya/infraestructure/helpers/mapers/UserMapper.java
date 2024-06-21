package com.riwi.libros_ya.infraestructure.helpers.mapers;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.riwi.libros_ya.api.dto.request.UserReq;
import com.riwi.libros_ya.api.dto.response.UserResp;
import com.riwi.libros_ya.domain.entities.UserEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    @InheritInverseConfiguration
    UserResp toResponse(UserEntity entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "loans", ignore = true)
    @Mapping(target = "reservations", ignore = true)
    UserEntity toEntity(UserReq req);

    List<UserResp> ReponseListToEntity(List<UserEntity> entity);

}
