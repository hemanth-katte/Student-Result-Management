package com.example.resultManagement.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    //private String rollNo;

    @Enumerated(value = EnumType.STRING)
    private BranchName branchName;

    private int marks;

    @ManyToOne
    @JoinColumn
    private Branch branch;

}
