package genericsplusspring.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.jpa.repository.JpaRepository;

import genericsplusspring.util.Convertible;

// Parametrizado no tipo da entidade, do DTO e do ID
// Basicamente dizendo q o "T" é um "Convertible<DTO>"
public interface GenericService<T extends Convertible<DTO>, DTO, ID> {
	
	JpaRepository<T, ID> getRepository();
	
	default DTO findById(ID id) {
		Optional<T> result = getRepository().findById(id);
		return (result.get()).convert();
	}
	
	default List<DTO> findAll() {
		List<T> list = getRepository().findAll();
		return list.stream().map(x -> x.convert()).collect(Collectors.toList());
	}
}
