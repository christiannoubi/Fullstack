package de.adorsys.employee.repository;

import de.adorsys.employee.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200/")
public interface LoginRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByUsername(String username);
}
