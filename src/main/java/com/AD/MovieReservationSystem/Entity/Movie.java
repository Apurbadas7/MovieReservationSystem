package com.AD.MovieReservationSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private List<String> genre;
    private String directorName;
    private int duration;
    private String language;
    private Date releaseDate;
    private double rating;

    @OneToMany(mappedBy = "movie")
    private List<Showtime> showtime;



}
