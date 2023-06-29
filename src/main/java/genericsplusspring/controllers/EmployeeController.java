package genericsplusspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import genericsplusspring.dto.EmployeeDTO;
import genericsplusspring.services.EmployeeService;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	// service chama o repository, retorna para o controller e retorna a resposta web da requisição
	@GetMapping(value = "/{id}")
	public ResponseEntity<EmployeeDTO> findById(@PathVariable Long id) {
		EmployeeDTO obj = service.findById(id);
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping()
	public ResponseEntity<List<EmployeeDTO>> findAll() {
		List<EmployeeDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
}
