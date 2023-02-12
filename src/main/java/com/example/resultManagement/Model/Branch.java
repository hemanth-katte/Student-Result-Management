package com.example.resultManagement.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String branchName;

    private String hodName;

    private String contactNumber;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
    private List<Student> studentList;

    @OneToOne
    private Grant grant;
}
