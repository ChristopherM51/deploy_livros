package br.com.christopherm51.lojalivro.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livro {
    // Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String autor;

    // Construtor
    public Livro(){
    }
    public Livro (int id, String titulo, String autor){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
    // Getters and Stters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
