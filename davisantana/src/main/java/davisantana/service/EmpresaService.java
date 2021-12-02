package davisantana.service;

import java.util.List;
import davisantana.domain.Empresa;

public interface EmpresaService {

	void salvar(Empresa empresa);
	
	void editar(Empresa empresa);
	
	void excluir(Long id);
	
	Empresa buscarPorID(Long id);
	
	List<Empresa> buscarTodos();

	boolean empresaTemProfissoes(Long id);

}
