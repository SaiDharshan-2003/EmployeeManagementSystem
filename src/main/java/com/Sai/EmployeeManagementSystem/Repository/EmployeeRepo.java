package com.Sai.EmployeeManagementSystem.Repository;

import com.Sai.EmployeeManagementSystem.Entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee, String> {
}
