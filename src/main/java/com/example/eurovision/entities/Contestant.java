package com.example.eurovision.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contestant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String artist;
    private String song;
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
    private Country country;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String video;
    private Integer points;
}
