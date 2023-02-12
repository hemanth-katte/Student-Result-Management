package com.example.resultManagement.Service;

import com.example.resultManagement.Model.BranchName;
import com.example.resultManagement.Model.Student;
import com.example.resultManagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String createStudent(String name, BranchName branchName){
        try {
            Student newStudent = new Student();

            newStudent.setName(name);
            newStudent.setBranchName(branchName);

            studentRepository.save(newStudent);

            return "Student successfully created";
        }
        catch (Exception e){
            return "Error in Student creation";
        }

    }
}
