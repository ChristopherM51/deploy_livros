package br.com.christopherm51.lojalivro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.christopherm51.lojalivro.Model.Livro;
import br.com.christopherm51.lojalivro.Repository.LivroRepository;

@Controller
public class LivrosController {
    @Autowired
    LivroRepository livrosRepository;

    @GetMapping("/livro")
    public List<Livro> list(){
        return (List<Livro>) this.livrosRepository.findAll();
    }    

    @PostMapping("/livro")
    public Livro create(@RequestBody Livro livro) {
        return this.livrosRepository.save(livro);
    }
    
    
}
