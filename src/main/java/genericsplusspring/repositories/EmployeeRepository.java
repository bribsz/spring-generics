package genericsplusspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import genericsplusspring.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
