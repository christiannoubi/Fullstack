package de.adorsys.employee.controller;

import de.adorsys.employee.domain.Employee;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {


    // Login of Employee
    @RequestMapping(value="/login")
    public boolean login(@RequestBody Employee employee) {
        return employee.getUsername().equals("employee") && employee.getPassword().equals("password");
    }

}
