package com.dockerdemo.sample.docker.ci.cd.pipeline;

//import com.airtelbank.platform.spring.boot.docker.demo.entity.Employee;
//import com.airtelbank.platform.spring.boot.docker.demo.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String greetings() {
        return "Hello world!";
    }

//    @PostMapping("/save")
//    public void saveEmployee(@RequestBody Employee employee) {
//        employeeRepository.save(employee);
//    }
//
//    @GetMapping("/employees")
//    public List<Employee> getEmployees() {
//        return employeeRepository.findAll();
//    }

}
