package davisantana.dao;

import org.springframework.stereotype.Repository;

import davisantana.domain.Cliente;

@Repository
public class ClienteDaoImpl extends AbstractDao<Cliente, Long> implements ClienteDao {

}
