package com.example.resultManagement.Service;


import com.example.resultManagement.Model.Branch;
import com.example.resultManagement.Model.Student;
import com.example.resultManagement.Repository.BranchRepository;
import com.example.resultManagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class BranchService {

    @Autowired
    BranchRepository branchRepository;

    public List<String> findMaxHod(){

        List<Branch> branchList = branchRepository.findAll();

        int maxPassingStudents = 0;
        HashMap<Branch,Integer> branchPassingStudentsMap = new HashMap<>();

        for(Branch branch : branchList){
            List<Student> studentList = branch.getStudentList();
            int passingStudents = 0;
            for(Student student : studentList){
                if(student.getMarks()>=40)
                    passingStudents++;
            }
            if(passingStudents>maxPassingStudents){
                maxPassingStudents = passingStudents;
            }
            branchPassingStudentsMap.put(branch,passingStudents);
        }


        List<String> hodPhoneNumbers = new ArrayList<>();

        for(Branch branch : branchPassingStudentsMap.keySet()){
            if(branchPassingStudentsMap.get(branch) >= maxPassingStudents){
                hodPhoneNumbers.add(branch.getContactNumber());
            }
        }

        return hodPhoneNumbers;

    }
}
