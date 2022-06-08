package com.example.testapplicationbe.model.datamodel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Table(name = "orders")
@Entity
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "start_time")
    private int startTime;

    @Column(name = "end_time")
    private int endTime;

}
