package com.example.resultManagement.Controller;

import com.example.resultManagement.Service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/branches")
public class BranchCotroller {

    @Autowired
    BranchService branchService;

    @GetMapping("/getHodOfMaxPassingStudents")
    public List<String> getHodWithMaxPassingStudents(){

        return branchService.findMaxHod();
    }
}
