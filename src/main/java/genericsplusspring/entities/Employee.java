package genericsplusspring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import genericsplusspring.dto.EmployeeDTO;
import genericsplusspring.util.Convertible;

// Entidade do JPA, pode ser alterado pelo BD

@Entity
@Table(name = "tb_employee")
// Basicamente dizendo que a classe "Employee" é conversível em "employeeDTO"
public class Employee implements Convertible<EmployeeDTO>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	public Employee() {
		
	}

	public Employee(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Esse metodo retorna um DTO copiando os dados do proprio objeto Employee, no caso "this"
	@Override
	public EmployeeDTO convert() {
		return new EmployeeDTO(this);
	}
}
