package com.riwi.libros_ya.api.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanReq {
    
    @FutureOrPresent(message = "The return date of the book must be in the present or future.")
    private LocalDate returnDate;

    @NotNull(message = "The user id is required.")
    private Long userId;

    @NotNull(message = "The book id is required.")
    private Long bookId;

}
