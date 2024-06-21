package com.riwi.libros_ya.api.dto.response;

import java.util.List;

import com.riwi.libros_ya.domain.entities.LoanEntity;
import com.riwi.libros_ya.domain.entities.ReservationEntity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class UserFullRes extends UserResp {
    List<LoanEntity> loans;
    List<ReservationEntity> reservations;
}
