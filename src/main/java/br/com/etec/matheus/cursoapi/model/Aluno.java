package br.com.etec.matheus.cursoapi.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table (name = "aluno")


public class Aluno {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @OneToMany

    private Long id;
    private String nomeAluno;
    private Integer idCurso;
    private Integer idCidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return id.equals(aluno.id) && nomeAluno.equals(aluno.nomeAluno) && idCurso.equals(aluno.idCurso) && idCidade.equals(aluno.idCidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeAluno, idCurso, idCidade);
    }
}

