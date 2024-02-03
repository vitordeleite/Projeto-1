
package crud.dao;

import crud.domain.Cliente;
import java.util.Collection;

public interface IClienteDAO {
 public Boolean cadastrar(Cliente cliente);
 public void excluir (Long cpf);
 public void alterar(Cliente cliente);
 public Cliente consutar (long cpf);
 public Collection<Cliente> buscarTodos();
}
