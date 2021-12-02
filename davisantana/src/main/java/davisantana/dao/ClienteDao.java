package davisantana.dao;

import java.util.List;

import davisantana.domain.Cliente;

public interface ClienteDao {
	
	void save(Cliente cliente);

	void update(Cliente cliente);

	void delete(Long id);

	Cliente findById(Long id);

	List<Cliente> findAll();
}

