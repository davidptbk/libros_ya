package com.riwi.libros_ya.domain.entities;

import java.util.List;

import com.riwi.libros_ya.Util.enums.Rol;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String username;
    @Column(nullable = false, length = 100)
    private String password;
    @Column(nullable = false, length = 100)
    private String email;
    @Column(nullable = false, length = 100)
    private String fullName;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private Rol role;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<ReservationEntity> reservations;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<LoanEntity> loans;
}
