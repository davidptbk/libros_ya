package com.riwi.libros_ya.api.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservationReq {
    @NotNull(message = "The user id is required.")
    private Long userId;
    @NotNull(message = "The book id is required.")
    private Long bookId;
}
