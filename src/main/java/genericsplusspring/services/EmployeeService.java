package genericsplusspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import genericsplusspring.dto.EmployeeDTO;
import genericsplusspring.entities.Employee;
import genericsplusspring.repositories.EmployeeRepository;

@Service
public class EmployeeService implements GenericService<Employee, EmployeeDTO, Long> {
	
	@Autowired
	private EmployeeRepository repository;

	@Override
	public JpaRepository<Employee, Long> getRepository() {
		return repository;
	}
	
	
	/*
	public EmployeeDTO findById(Long id) {
		Optional<Employee> result = repository.findById(id);
		return new EmployeeDTO(result.get());
	}

	// Lista retornada pelo repository é uma lista de employee(que é a entidade monitorada pelo JPA)
	// Porém, queremos a lista de DTO, então será convertido essa list de employee para employeeDTO
	public List<EmployeeDTO> findAll() {
		List<Employee> list = repository.findAll();
		// Transformando cada elemento da lista conforme a função informada entre "()"
		// Função lambda "x", que para cada "x", ele leva um new employeeDTO recebendo x
		// ".collect" utilizado para converter de uma lista de um tipo para outro
		return list.stream().map(x -> new EmployeeDTO(x)).collect(Collectors.toList());
	}
	*/
}
