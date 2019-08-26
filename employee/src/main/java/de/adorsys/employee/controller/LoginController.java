package de.adorsys.employee.controller;

import de.adorsys.employee.domain.Employee;
import de.adorsys.employee.domain.LoginRequest;
import de.adorsys.employee.domain.LoginResponse;
import de.adorsys.employee.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.ResponseEntity;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

    // Login of Employee

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginRequest loginRequest) {
        Optional<Employee> employee = loginRepository.findByUsername(loginRequest.getUsername());
        if (!employee.isPresent()) {
            ResponseEntity.badRequest().body("Username does not exist!!!");
        }
        Employee foundEmployee = employee.get();
        boolean result = loginRequest.getPassword().equals(foundEmployee.getPassword());
        return result ? new ResponseEntity<>(new LoginResponse(true), HttpStatus.OK) : ResponseEntity.badRequest().body("Username and password does not match!!!");
    }
}
