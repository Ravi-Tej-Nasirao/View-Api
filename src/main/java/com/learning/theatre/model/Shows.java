package com.learning.theatre.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "shows")
public class Shows implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "movie_id", nullable = false)
    private Long movieId;

    @Column(name = "auditorium_id", nullable = false)
    private Long auditoriumId;

    @Column(name = "show_date", nullable = false)
    private Date showDate;

    @Column(name = "start_time", nullable = false)
    private Date startTime;

    @Column(name = "end_time", nullable = false)
    private Date endTime;

}
