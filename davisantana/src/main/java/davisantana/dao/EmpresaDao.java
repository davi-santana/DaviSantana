package davisantana.dao;

import java.util.List;

import davisantana.domain.Empresa;

public interface EmpresaDao {

	void save(Empresa empresa);

	void update(Empresa empresa);

	void delete(Long id);

	Empresa findById(Long id);

	List<Empresa> findAll();
}
