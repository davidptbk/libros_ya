package com.riwi.libros_ya.api.dto.response;

import java.time.LocalDate;

import com.riwi.libros_ya.domain.entities.BookEntity;
import com.riwi.libros_ya.domain.entities.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanResp {
    private Long id;
    private LocalDate loanDate;
    private LocalDate returnDate;
    private String status;
    private UserEntity user;
    private BookEntity book;

}
