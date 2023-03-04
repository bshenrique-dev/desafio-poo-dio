package me.dio.bootcamp;

import me.dio.conteudos.Conteudo;
import me.dio.conteudos.Curso;
import me.dio.conteudos.Mentoria;
import me.dio.devs.Dev;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;

    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new HashSet<>();

    public Bootcamp(){}

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, devsInscritos, conteudos);
    }
}
