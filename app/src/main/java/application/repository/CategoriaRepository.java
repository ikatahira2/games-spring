package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.model.Categoria;

public interface Categoria extends CrudRepository<Categoria,Long>{

    
}