package com.example.resultManagement.Controller;

import com.example.resultManagement.Model.BranchName;
import com.example.resultManagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
    public String  addStudent(@RequestParam String name, @RequestParam BranchName branchName){

        String ret = studentService.createStudent(name,branchName);

        return ret;

    }
}
