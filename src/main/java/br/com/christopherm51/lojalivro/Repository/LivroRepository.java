package br.com.christopherm51.lojalivro.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.christopherm51.lojalivro.Model.Livro;

public interface LivroRepository  extends CrudRepository<Livro,Integer>{
    
}
