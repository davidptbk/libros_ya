package com.riwi.libros_ya.api.controllers;

import org.springframework.http.ResponseEntity;

public interface GenericController <RequestDto, ResponseDto, ID>{
    public ResponseEntity<ResponseDto> create(RequestDto request);

    public ResponseEntity<ResponseDto> get(ID id);

    public ResponseEntity<ResponseDto> update(RequestDto request, ID id);

    public ResponseEntity<Void> delete(ID id);
}
