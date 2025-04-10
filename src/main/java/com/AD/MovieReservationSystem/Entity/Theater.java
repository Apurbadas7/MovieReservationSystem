package com.AD.MovieReservationSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Theater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String location;
    private int totalScreen;

    @OneToMany(mappedBy = "theater")
    private List<Showtime> showtime;

    @OneToMany(mappedBy = "theater")
    private List<Seat> seat;
}
