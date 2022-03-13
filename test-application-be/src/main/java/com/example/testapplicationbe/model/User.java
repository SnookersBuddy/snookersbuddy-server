package com.example.testapplicationbe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @Column(name = "name")
        private String name;

        @Column(name = "email")
        private String email;

    }

