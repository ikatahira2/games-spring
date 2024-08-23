package application.model;

import java.lang.annotation.Inherited;
import java.lang.annotation.Target;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.processing.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "plataformas")
public class Plataforma{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(unique=true, nullable=false)
private String nome;

@ManyToMany(mappedBy = "plataformas")
private Set<Jogo> jogos = new HashSet<>();

public void setId(long id) {
    this.id = id;
}
public long getId() {
    return id;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getNome() {
    return nome;
}
public void setJogos(Set<Jogo> jogos) {
    this.jogos = jogos;
}
public Set<Jogo> getJogos() {
    return jogos;
}

}