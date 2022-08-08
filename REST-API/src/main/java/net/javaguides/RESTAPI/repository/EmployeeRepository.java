package net.javaguides.RESTAPI.repository;

import net.javaguides.RESTAPI.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public Optional<Employee> findByEmail(String email);
}