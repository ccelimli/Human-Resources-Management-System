package com.hrms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "JobSeeker")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jobseeker extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "nationalityNo")
    private String nationalityNo;
    @Column(name = "yearOfBirth")
    private int yearOfBirth;
}
