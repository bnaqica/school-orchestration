package com.bnaqica.schoolorchestrator.student.client;

import com.bnaqica.schoolorchestrator.student.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "school-student")
public interface StudentFeignClient {

    @GetMapping("/student/{id}")
    Student getStudentById(@PathVariable("id") Long id);

}
