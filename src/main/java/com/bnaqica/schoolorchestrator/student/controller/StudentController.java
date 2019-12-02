package com.bnaqica.schoolorchestrator.student.controller;

import com.bnaqica.schoolorchestrator.student.client.StudentFeignClient;
import com.bnaqica.schoolorchestrator.student.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {

    private StudentFeignClient studentFeignClient;

    public StudentController(StudentFeignClient studentFeignClient) {
        this.studentFeignClient = studentFeignClient;
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") Long id) {
        log.info("getStudentById called for id {}", id);

        return studentFeignClient.getStudentById(id);
    }
}
