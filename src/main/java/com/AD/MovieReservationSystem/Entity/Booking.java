package com.AD.MovieReservationSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp bookingDate;


    @OneToMany
    private List<Seat> seats;

    @ManyToOne
    private User user;

    @ManyToOne
    @JoinColumn(name = "showtime_id")
    private Showtime showTime;



}
