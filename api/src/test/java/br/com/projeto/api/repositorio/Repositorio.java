package br.com.projeto.api.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.api.modelo.Task;

public interface Repositorio  extends CrudRepository<Task, Long>{


}
