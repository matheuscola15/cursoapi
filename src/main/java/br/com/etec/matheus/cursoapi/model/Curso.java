package br.com.etec.matheus.cursoapi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "curso")

public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idcurso;
    private String nomecurso;

    @JsonIgnore
    @OneToMany(mappedBy = "curso")
    private List<Aluno> alunos = new ArrayList<>();

    public Integer getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return idcurso.equals(curso.idcurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcurso);
    }
}
