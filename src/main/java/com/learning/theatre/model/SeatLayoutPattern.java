package com.learning.theatre.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatLayoutPattern implements Serializable {

    private static final long serialVersionUID = 1L;

    private String rowId;
    private List<String> pattern = new ArrayList<>();

}
