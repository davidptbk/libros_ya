package com.riwi.libros_ya.api.dto.response;

import java.util.List;

import com.riwi.libros_ya.domain.entities.LoanEntity;
import com.riwi.libros_ya.domain.entities.ReservationEntity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BookFullRes extends BookResp{
    List<LoanEntity> loans;
    List<ReservationEntity> reservations;
}
