package com.learning.theatre.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookingResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private String message;
    private Booking booking;
}
