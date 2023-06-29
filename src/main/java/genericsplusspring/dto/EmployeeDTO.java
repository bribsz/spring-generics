package genericsplusspring.dto;

import genericsplusspring.entities.Employee;

// Tipo básico para carregar os dados para responder a requisição
// Copia os dados de Employee para EmployeeDTO para organizar a arquitetura

// Diferença entre DTO(objeto para transferencia de dados) e DAO

// DTO é um objeto auxiliar para carregar os dados, 
// da forma customizada que for especificada na classeDTO
// ou seja, transferir os dados sem uma ferramente de ORM(nesse caso, JPA),
// auxiliar para carregar os dados que forem desejados para trafegar


// DAO(objeto de acesso a dados)
// Padrão de projeto similar ao repository, objeto responsável por fornecer operações de acesso a dados
// Vai ter métodos para buscar, inserir, deletar, atualizar os dados do BD
// objeto com responsabilidade de oferecer operações de CRUD

public class EmployeeDTO {
	
	private Long id;
	private String name;
	
	public EmployeeDTO() {
		
	}

	public EmployeeDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Construtor q recebe a entidade Employee
	// e copia os dados dela para o objeto DTO
	public EmployeeDTO(Employee entity) {
		this.id = entity.getId();
		this.name = entity.getName();
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
}
